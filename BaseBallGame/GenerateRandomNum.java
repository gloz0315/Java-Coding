package BaseBallGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandomNum {
    public int randomMake(){
        Random random = new Random();
        return random.nextInt(9)+1;     // 1부터 9 사이의 값을 무작위로 만듬
                                              // randmom.nextInt(n) 은 0부터 n까지의 난수를 가져옴
    }

    public List<Integer> create(){
        List<Integer> computerNumber = new ArrayList<>();

        while(computerNumber.size() < 3){ // 배열의 크기가 3이 될때까지 돌려줌
            int randomNumber = randomMake();

            if(computerNumber.contains(randomNumber))
                continue;
            else
                computerNumber.add(randomNumber);
        }
        return computerNumber;
    }

}
