import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); // Integer타입으로 우선순위 큐 선언(늎은 숫자 순으로 우선순위 결정)
        
        for(int i = 0; i < priorities.length; i++){    // 우선순위의 배열을 큐에 넣음
            queue.add(priorities[i]);
        }
        
        while(!queue.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(priorities[i] == queue.peek()){             // 큐에 나오게 될 우선순위 값이 처음 priorities와 같다면
                    if(i == location){                         // 내가 찾아야할 location의 위치가 같다면 
                        answer++;                              // 몇번째로 나오는지 확인하기위해 큐가 나올때마다 answer값을 하나씩 올린다.
                        return answer;
                    }
                    
                    queue.poll();
                    answer++;
                    
                }
            }
        }
        
        return -1;
    }
}

// 프로그래머스 레벨2 프린터 문제 ( 우선순위 큐를 통해 문제를 풀었다. )
// 점점 하다보면 내가 아직도 부족한 코딩실력이라는 것을 뼈저리게 느끼게 된다. 아무리 해도 모르는 수식, 처음보는 메소드 들 또한...
// 더 열심히 해야겠다.


import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        List<PrintJob> printer = new ArrayList<PrintJob>();  
        
        for(int i = 0; i < priorities.length; i++){
            printer.add(new PrintJob(priorities[i],i));                               // PrintJob타입의 printer변수에 우선순위와 위치의 값들을 넣어준다
        }
        
        while(!printer.isEmpty()){
            PrintJob job = printer.remove(0);                                         // PrintJob 타입의 job이라는 변수에 printer변수의 0번째 인덱스의 정보들을 넣는다.
                                                                                      // 큐로 따지면 FIFO 형식
            if(printer.stream().anyMatch(otherJob -> job.priority < otherJob.priority)){    // job의 우선순위보다 더 높은 우선순위가 있는지를 람다식을 통해 비교한다.
                printer.add(job);                                                         // 만약 더 높은 우선순위가 있다면 빼넣은 값을 다시 printer에 넣어준다 ( 큐 방식)
            }else{
                answer++;                                                                 // answer 값을 올리는 이유는 몇번째로 프린트가 되었는지 확인하기 위해서
                
                if(job.location == location){                                               // 내가 찾으려고 하는 위치와 job의 위치가 같다면 찾았으니 멈춘다
                    break;
                }
            }
        }
        
        return answer;
    }
}

class PrintJob{                                            // 우선순위와 위치에 대하여 ( priorities와 location ) 하나로 묶는 클래스를 만들어준다.
    int priority;
    int location;
    
    public PrintJob(int priority, int location){
        this.priority = priority;
        this.location = location;
    }
}

// 또 다른 방식으로 찾아서 풀어봤다.. 이 방식이 오히려 나에게 더 맞을지도 ?
// 람다식과 stream에 관해서 아직 제대로 된 공부를 하지 않아서 이 부분을 조금 더 공부해야겠다
