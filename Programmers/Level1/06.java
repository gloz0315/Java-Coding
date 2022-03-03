// 프로그래머스 레벨1 완주하지 못한 선수에 대한 코딩 문제
// HashMap에 관한 것을 다시금 공부해 볼 필요가 있다고 생각한다..
// 이번 문제에 관한 코딩은 거의 혼자서 했다고 말 할 수가 없다..

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String player : participant)
            map.put(player, map.getOrDefault(player,0) + 1);
        for(String player : completion)
            map.put(player, map.get(player)-1);
        
        Iterator<Map.Entry<String,Integer>> iter = map.entrySet().iterator();
        
        while(iter.hasNext()){
            Map.Entry<String,Integer> entry = iter.next();
            if(entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        
        return answer;
    }
}
