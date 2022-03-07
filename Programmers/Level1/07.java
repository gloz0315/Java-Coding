import java.util.*;


class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] number = new int[3];
        int[] answer = new int[commands.length];
        
        List<Integer> answerList = new ArrayList<Integer>();
        
        for(int i =0; i < commands.length; i++){
            for(int j = 0; j < commands[i].length; j++){
                number[j] = commands[i][j];
            }
            
            answerList.add(sorting(array,commands[i][0],commands[i][1],commands[i][2]));
            
        }
        
        for(int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
    
    public int sorting(int[] array, int first, int end, int num){
        List<Integer> numberList = new ArrayList<Integer>();
        
        for(int i = first-1; i < end; i++){
            numberList.add(array[i]);
        }
        
        Collections.sort(numberList);
        int number = numberList.get(num-1);
        
        return number;
    }
}


// 프로그래머스 레벨1 K번째 수 문제이다.
// 정렬을 통해 하는 문제인데, 더욱 간단하게 표현을 해봐야겠다.
// 또한 배열을 리스트로, 리스트를 배열 형변환에 대하여도 더 공부해야겠다.
