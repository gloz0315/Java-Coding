import java.util.*;


class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] number = new int[3];
        int[] answer = new int[commands.length];
        
        List<Integer> answerList = new ArrayList<Integer>();
        
        for(int i =0; i < commands.length; i++){
            answerList.add(sorting(array,commands[i][0],commands[i][1],commands[i][2]));           // 각각의 입력값들을 answerList에 더해준다.
            
        }
        
        for(int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);                             // 리스트를 배열에 넣기 위해 for문을 이용하여 넣어준다.
        }
        
        return answer;
    }
    
    public int sorting(int[] array, int first, int end, int num){       // array리스트를 통해 k번째 수에 관한 값들을 return하는 함수를 만들었다.
        List<Integer> numberList = new ArrayList<Integer>();            // arraylist를 하나 만들어준다.
        
        for(int i = first-1; i < end; i++){
            numberList.add(array[i]);                                   // array배열에서의 first번째부터 end번째까지! ( 인덱스 번호가 아니다. ) numberList에 넣어준다.
        }
        
        Collections.sort(numberList);                                   // numberList를 정렬해준다. ( 이때, Collections.sort() 메소드를 이용하여 정렬 )
        int number = numberList.get(num-1);                             // 내가 찾을 k번째 수를 반환한다. ( 인덱스 번호가 아니다. )
        
        return number;
    }
}


// 프로그래머스 레벨1 K번째 수 문제이다.
// 정렬을 통해 하는 문제인데, 더욱 간단하게 표현을 해봐야겠다.
// 또한 배열을 리스트로, 리스트를 배열 형변환에 대하여도 더 공부해야겠다.
