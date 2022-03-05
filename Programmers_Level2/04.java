import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++){
            queue.add((int)(Math.ceil( (100.0-progresses[i]) / speeds[i]) ) );   // 큐 값에 각각 프로그래스들이 걸리는 날짜들을 넣는다.
        }
        
        
        while(!queue.isEmpty()){
            int days = queue.poll();                          // days의 값에 처음 넣었던 큐의 값을 빼준다. ( 여기서 days값이 기준을 둔다. )
            int cnt = 1;
            
            while(!queue.isEmpty() && days >= queue.peek()){  // peek() 메소드는 큐 안에서 top값을 빼지 않고 어떤 값인지 확인하는 메소드 
                                                              // 만약 days값이 그 다음에 나올 큐 값보다 크다면 그 다음에 나올 값을 큐에 빼주고 카운트 숫자를 하나 더 센다.
                cnt++;                                            
                queue.poll();
            }
                            
            answerList.add(cnt);                              // answerList에 카운트 숫자를 넣는다
        }
        
        int[] answer = new int[answerList.size()];              // 새로운 answer 배열의 크기를 만들어준다.
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = answerList.get(i);                       // ArrayList에 정리된 값들을 answer에 각각 넣어준다.
        }
        
        return answer;
        
//         return answer.stream().mapToInt(Integer::intValue).toArray();  // 요 마지막 부분에 대해서는 이해가 필요할 것 같다..
    }
}

// 이번 문제는 스택/큐 구현 문제로 프로그래머스 레벨2 기능개발의 문제이다.
// 스택, 큐에 관해 더욱 공부를 해야겠다.
