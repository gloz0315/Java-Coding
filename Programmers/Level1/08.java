import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] answers) {

        int[] number1 = {1,2,3,4,5};                              // 수학포기자1 찍으려는 답의 패턴
        int[] number2 = {2,1,2,3,2,4,2,5};                        // 수학포기자2 찍으려는 답의 패턴
        int[] number3 = {3,3,1,1,2,2,4,4,5,5};                    // 수학포기자3 찍으려는 답의 패턴

        int[] numbercount = new int[3];                           // 수학포기자1,2,3이 맞춘 답의 개수들을 저장하기 위한 배열 numbercount 변수를 만듬

        for(int i = 0; i < answers.length; i++){                  
            if(answers[i] == number1[i%5]){                       // 수학포기자1 의 답의 패턴은 5가지로 나눠지기 때문에 5를 나눈 나머지 
                numbercount[0]++;              
            }
            if(answers[i] == number2[i%8]){                       // 수학포기자2 의 답의 패턴은 8가지로 나눠지기 때문에 8을 나눈 나머지
                numbercount[1]++;
            }
            if(answers[i] == number3[i%10]){                      // 수학포기자3 의 답의 패턴은 10가지로 나눠지기 때문에 10을 나눈 나머지
                numbercount[2]++;
            }
        }

        int max = Math.max((Math.max(numbercount[0],numbercount[1])),numbercount[2]);         // 세 수의 최대값을 구한다.

        List<Integer> answerList = new ArrayList<Integer>();                                  // 리스트 하나를 만들어준다. ( 값을 넣기 위해서 )

        for(int i = 0; i < numbercount.length; i++){
            if(max == numbercount[i])            
                answerList.add(i+1);                                                            // 답은 1,2,3 중에 하나가 나와야하므로 인덱스 번호에 1을 더한다
        }

        int[] answer = new int[answerList.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = answerList.get(i);                                                   // 리스트를 배열로 변환한다.
        }

        return answer;
    }
}


// 프로그래머스 레벨1 모의고사 문제이다.
// 완전탐색을 통해 문제를 풀 수 있는 문제이다.

// 이것보다 더 간결하고 깔끔한 코드들이 있다.. 역시 코딩의 세계..
