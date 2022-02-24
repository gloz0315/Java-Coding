class Solution {
    public int solution(int[] nums) {
        int answer = 0;



        // 삼중 for문을 통해 3개의 수를 찾기
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    int n = nums[i] + nums[j] + nums[k];

                    answer += isPrime(n) ? 1 : 0;       // 소수라면 1을 더하고 아니면 0을 더함
                    }

                }
            }
        return answer;
    }

    public Boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){          // Math.sqrt 함수를 이용해 제곱근을 통해 간단하게 표현

            if(num % i == 0)              // 소수가 아니면 false
                return false;
        }
        return true;                      // 소수이면 true
    }
}

// 소수 만들기
