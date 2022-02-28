package BaseBallGame;

import java.util.Scanner;

public class Playagain {
    public boolean playagain(){
        System.out.println("경기를 다시 시작하겠습니까? 다시 시작 : 1, 종료 : 2");
        Scanner stdIn = new Scanner(System.in);
        char answer = stdIn.next().charAt(0);
        if( answer == '1'){
            return true;              // 다시 시작
        }
        return false;
    }
}
