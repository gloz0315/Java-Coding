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


// keySet()을 통해 마지막 value가 0 이 아닌 마지막 주자를 찾는 방법에서의 또 다른 코드
// HashMap에 관한 공부를 통해 Map 전체 출력하는 entrySet과 keySet의 차이점에 대해 다시 한번 숙지


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 1. Hash Map을 만든다
        HashMap<String,Integer> map = new HashMap<>();
        for(String player : participant)
            map.put(player,map.getOrDefault(player,0) + 1); // map에다가 넣어주기 put key를 player로 쓸 것이며
        //getOrDefault는 map에서 플레이러라는 키를 가진 값을 가져달라는 의미 , 만약 플레이어가 없다면 0을 달라는 것
        // 플레이어가 없다면 0을 줘서 거기에 1을 더하면 처음으로 map이라는 hashmap 테이블에서 선수이름과 카운트가 시작됨
        // 만약 선수가 있다면, 그 선수 값의 value를 가져오고 거기에 1을 더함

        // 2. Hash Map을 뺀다
        for(String player : completion)
            map.put(player, map.get(player) - 1);
        // 여기서 가져온 player라는 값에 플레이어의 이름이 있다면 하나씩 빼는 것을 의미


        // 3. value가 0이 아닌 마지막 주자를 찾는다.
        for(String key : map.keySet()){
            // HashMap.keySet()의 의미는 HashMap이 들고 있는 전체 Key의 배열을 반환, 즉 map이 가지고 있는 key들을 꺼냄
            // for each문을 통해 map.keySet()에서 하나씩 꺼내서 String key 값에 하나씩 넣어주는 의미
            if(map.get(key) != 0){
                // key값을 가져오는데, 그 key값이 0이 아닌 숫자라면, 즉 이 사람이 정답이라는 의미
                answer = key;
                break;
            }
        }
       

        return answer;
    }

    public static void main(String args[]){
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        Solution2 sol = new Solution2();
        System.out.println(sol.solution(part,comp));
    }
}



// entrySet() 메서드는 key와 value값이 모두 필요한 경우에 사용
// keySet() 메서드는 key 값만 필요한 경우 사용
// entrySet()이 출력함에 있어서 더 빠름!




import java.util.*;
import java.util.Iterator;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < participant.length; i++){
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        
        for(int i = 0; i < completion.length; i++){
            if(map.containsKey(completion[i])){
                map.put(completion[i], map.get(completion[i]) - 1);
            }
        }
        
        Iterator<String> keys = map.keySet().iterator();
        List<String> lst = new ArrayList<>();
        
        while(keys.hasNext()){
            String key = keys.next();
            if(map.get(key) != 0){
                lst.add(key);
            }
        }
        
        String answer = lst.get(0);
        
        return answer;
    }
}

// 다시 한번 해 본 결과
