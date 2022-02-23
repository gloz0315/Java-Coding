class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char tmp;
        
        if(s.length() != 4 && s.length() != 6)
            return false;
        
        for(int i = 0; i < s.length(); i++){
            tmp = s.charAt(i);
            
            if(!('0' <= tmp && tmp <= '9'))
                return answer = false;
        }
        
        return answer;
    }
}


// 새로운 방법

class Solution {
    public boolean solution(String s) {
        
        if(s.length() == 4 || s.length() == 6){
            try{
                int num = Integer.parseInt(s);
                return true;
            }catch(NumberFormatException e){
                return false;
            }
            
        }
        return false;
        
    }
}
