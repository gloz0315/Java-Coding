import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        int left_first = 10;
        int right_first = 12;

        for(int numberList : numbers){
            if(numberList == 1 || numberList == 4 || numberList == 7){
                answer += "L";
                left_first = numberList;
            }else if(numberList == 3 || numberList == 6 || numberList == 9){
                answer += "R";
                right_first = numberList;
            }else{

                if(numberList == 0){
                    numberList += 11;
                }



                int distance_left =(Math.abs(left_first - numberList)) / 3 + (Math.abs(left_first - numberList)) % 3;
                int distance_right = (Math.abs(right_first - numberList)) / 3 + (Math.abs(right_first - numberList)) % 3;

                if(distance_left == distance_right){
                    if(hand.equals("right")){
                        answer += "R";
                        right_first = numberList;
                    }else{
                        answer += "L";
                        left_first = numberList;
                    }
                }else if(distance_left > distance_right){
                    answer += "R";
                    right_first = numberList;
                }else{
                    answer += "L";
                    left_first = numberList;
                }
            }
        }
        return answer;
    }
}

// 프로그래머스 레벨1 키패드 누르기 문제이다.
// 일단 숫자와 숫자 버튼 사이의 길이 값을 어떻게 구할지가 막막해서 찾아보았다.
// 도대체 이런 식으로 이용할거라고는 생각하지 못했다.. ㅠ.ㅠ 난 아직도 많이 부족한거같다.
