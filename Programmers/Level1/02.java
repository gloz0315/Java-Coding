class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2]; // 최대, 최소 순위 배열 2개
        int cnt = 0;
        int zero_num = 0;

        for(int i=0; i < lottos.length; i++){  // lottos에 0이 들어가 있는지 확인
            if(lottos[i] == 0)
                zero_num++;
            for(int j = 0; j < win_nums.length; j++){ // lottos와 win_nums의 숫자가 같은지 확인
                if(lottos[i] == win_nums[j])
                    cnt++;
            }
        }

        answer[0] = Rank(cnt+zero_num);   // 최대 순위
        answer[1] = Rank(cnt);            // 최소 순위

        return answer;
    }

    public static int Rank(int n){
        if(n == 6)
            return n = 1;
        else if(n == 5)
            return n = 2;
        else if(n == 4)
            return n = 3;
        else if(n == 3)
            return n = 4;
        else if(n == 2)
            return n = 5;
        else
            return 6;
    }
}
