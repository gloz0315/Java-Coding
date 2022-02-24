class Solution {
    public int solution(String s) {
        
        String[] english = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        
        for(int i = 0; i < 10; i++){
            s = s.replace(english[i],num[i]);
        }
        
        return Integer.parseInt(s);
    }
    
}

// 프로그래머스의 코딩테스트 level1의 숫자 문자열과 영단어 문제이다.
