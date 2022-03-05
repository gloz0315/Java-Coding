import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++){
            queue.add((int)(Math.ceil( (100.0-progresses[i]) / speeds[i]) ) );
        }
        
        
        while(!queue.isEmpty()){
            int days = queue.poll();
            int cnt = 1;
            
            while(!queue.isEmpty() && days >= queue.peek()){
                cnt++;
                queue.poll();
            }
            
            answer.add(cnt);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();  // 요 마지막 부분에 대해서는 이해가 필요할 것 같다..
    }
}

// 이번 문제는 스택/큐 구현 문제로 프로그래머스 레벨2 기능개발의 문제이다.
// 스택, 큐에 관해 더욱 공부를 해야겠다.
