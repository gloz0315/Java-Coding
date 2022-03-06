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
