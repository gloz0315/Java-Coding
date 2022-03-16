import java.util.Scanner;

public class Main_1120 {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        String X = stdIn.next();
        String Y = stdIn.next();

        int result = X.length();

        for(int i = 0; i <= Y.length()-X.length(); i++){        // Y와 X의 문자열의 길이의 차이값만큼 for문을 돌린다.
            int cnt = 0;                                        // 숫자를 세는 카운트

            for(int j = 0; j < X.length(); j++){
                if(X.charAt(j) != Y.charAt(i+j)){               // 서로의 인덱스 위치에서의 문자열이 다를 경우에 cnt값을 하나씩 올린다.
                    cnt++;
                }
            }
                                                  
            if(result > cnt){                                   // 여기서 최소값을 구해주면 된다. 
                result = cnt;                                   // result와 cnt의 차이를 통해서 최소값을 넣으면 끝
            }

        }

        System.out.println(result);
    }
}

// 문자열 문제 
// 두 문자열의 차이만큼 돌려서 각 문자열의 인덱스 위치가 서로 같지 않으면 cnt를 하나씩 올려서 최소값을 찾는 문제이다.
// X의 길이는 Y보다 작거나 같으며 작을 경우에 앞이나 뒤에 문자열을 추가적으로 배치해줘서 서로의 인덱스 위치에서의 문자가 다르면 cnt를 하나씩 올린다.
// 처음에 문자를 넣는것까지 생각을 할까 생각을 했지만, 결국에는 최소값을 찾는 경우이므로 생각해주면 된다.
