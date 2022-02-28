package BaseBallGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    public List<Integer> playerNumber(){
        System.out.print("숫자를 입력해주세요: ");
        Scanner stdIn = new Scanner(System.in);

        List<Integer> playerNum = new ArrayList<>();
        String input = stdIn.next();

        for(String number: input.split("")){
            playerNum.add(Integer.parseInt(number));      // 문자열로 받은 것을 인트형으로 변형해서 대입
        }
        return playerNum;
    }
}
