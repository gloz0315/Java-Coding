import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> numberstack = new Stack<>();
        numberstack.push(0);                                       // 스택을 만들어 그 아래에 0의 값을 넣어준다. (오류가 나지 않게) 만약 넣을때 스택 안에 값이 없었다면 오류가 나므로
        
        for(int move : moves){
            for(int j = 0; j < board.length; j++){
                if(board[j][move-1] != 0){
                    if(numberstack.peek() == board[j][move-1]){       // 스택 안에 값과 비교하기
                        numberstack.pop();
                        answer += 2;                                 // 두 값이 같으면 터지고 +2를 더함
                    }else{
                        numberstack.push(board[j][move-1]);           
                    }
                    board[j][move-1] = 0;                             // 뽑았으므로 그 안에 값은 0으로 만들어줌
                    break;
                    
                }else{
                    continue;
                }
            }
        }
        
        return answer;
    }
}

//카카오 인형뽑기 게임 구현 관련 문제이다.
// 스택을 이용하여 풀이했던 과정
// 공부하자
