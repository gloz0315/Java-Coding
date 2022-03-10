import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(String[][] clothes) {
        
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);              // 위장 옷의 종류에 대해 카운터 한다
        }
        
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;                                                                 // 누적하기 위해 answer를 1로 둔다
        
        while(it.hasNext()){
            answer *= it.next().intValue() + 1;                                        // 아무것도 안 입은 상태도 세야 하므로 +1을 추가한다.
        }
        
        return answer - 1;                                                             // 아무 것도 입지 않은 상태인 1개를 빼준다.
    }
}

// 프로그래머스 레벨2 위장 문제이다.
// 해시를 통해 푸는 문제인데, 아직도 Iterator함수에 대해 자세히 잘 모르겠다.
// 제대로 이해하고, 숙지하며 넘어가야겠다.
