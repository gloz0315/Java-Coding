import java.util.Scanner;
import java.lang.Math;

public class Main_1463 {

    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int dp[] = new int[N+1];
        dp[0] = 0;
        dp[1] = 0;

        for(int i = 2; i <= N; i++){
            dp[i] = dp[i-1] + 1;
            if(i % 2 == 0){
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            }
            if(i % 3 == 0){
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
            }
        }
        System.out.println(dp[N]);
    }
}

// 재귀함수 문제에 대한 내용이다.
// 숫자 N을 넣어서 3으로 나누어 떨어지면 나누고, 2로 나누어 떨어지면 나누고, 그렇지 않다면 1을 빼는 방식으로 하는 문제
// 연산을 할 때마다 count를 더해서 최소 연산만으로 나타나게끔 하는 문제이다.

// 이번 문제로 인해 재귀함수에 대해 더 자세하게 공부할 필요가 있다고 느꼈다.
