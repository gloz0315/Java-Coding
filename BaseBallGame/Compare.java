package BaseBallGame;

import java.util.List;

public class Compare {
    public int howMnay(List<Integer> computer, List<Integer> player){
        int result = 0;

        for(int i = 0; i < player.size(); i++){        // 플레이어의 숫자가 컴퓨터 숫자에 포함이 되어있다면 하나씩 늘림
            if(computer.contains(player.get(i))){      // 여기서 숫자를 세는 것은 스트라이크와 볼의 숫자를 합친 값
                result += 1;
            }
        }

        return result;
    }

    public int countStrike(List<Integer> computer, List<Integer> player){
        int strike = 0;

        for(int i = 0; i < player.size(); i++){           // 만약 같은 위치에서의 숫자가 같다면 스트라이크
            if(computer.get(i) == player.get(i)){
                strike += 1;
            }
        }

        return strike;
    }
}
