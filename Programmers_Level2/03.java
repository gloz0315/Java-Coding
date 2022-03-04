import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i = 0; i < phone_book.length; i++){
            map.put(phone_book[i],i); // key-value값 
        }
        
        for(int i = 0; i < phone_book.length; i++){
            for(int j = 0; j < phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j))) // 길이를 1 ~ 전체길이-1 만큼의 substring을 떼어서, hashmap에 존재한다면 접두어를 존재한다고 
                    return answer = false;
            }
        }
        return answer;
    }
}

// 해시 함수를 통한 프로그래머스 전화번호 목록 문제이다.
// level1에서의 마라톤 문제와 같은 맥락을 통해 이해하면 된다.
