// 피보나치 수열 문제이다

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int num1 = 0;
        int num2 = 1;
        
        for(int i = 2; i <= n; i++){
            answer = (num1 + num2) % 1234567;
            num1 = num2;
            num2 = answer;
        }
        
        return answer;
    }
}

// 배열을 통하여 문제를 푸려고 했지만 계속 처리시간문제나 오류로 인하여 풀지 못하였다.

// 내가 생각했던 배열의 문제

class Solution {
  public int solution(int n){
    int answer = 0;
    int[] data = new int[n+1];
    
    data[0] = 0;
    data[1] = 1;
    
    for(int i = 2; i <= n; i++){
      data[i] = data[i-1] - data[i-2];
    }
    
    answer = data[n] % 1234567;
    
    return answer;
 }
  
  // 시간처리 문제나 오류가 떠서 뭔지 모르겠다..
