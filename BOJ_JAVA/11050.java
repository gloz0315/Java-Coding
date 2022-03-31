import java.util.Scanner;


public class Main_11050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int K = input.nextInt();

        System.out.print(factorial(N) / (factorial(N-K) * factorial(K)));
    }

    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}



// --------------------------------------------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.print(factorial(N) / (factorial(N-K) * factorial(K)));
    }

    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}



// 이항계수 1
