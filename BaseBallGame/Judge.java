package BaseBallGame;

import java.util.List;

public class Judge {
    Compare compare = new Compare();
    public String judgement(List<Integer> computer, List<Integer> player){
        int total = compare.howMnay(computer, player);
        int strike = compare.countStrike(computer, player);
        int ball = total - strike;

        if(total == 0){              // 다 맞추지 않았다면
            return "낫싱";
        }else if(strike == 0){         // 스트라이크가 없다면
            return ball + "볼";
        }else if(ball == 0) {            // 볼이 없다면
            return strike + "스트라이크";
        }else                            // 나머지
            return ball + "볼 " + strike + "스트라이크";
    }
}
