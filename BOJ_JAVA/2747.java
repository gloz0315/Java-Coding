import java.util.Scanner;

public class Main_2747_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int f0 = 0;
        int f1 = 1;
        int temp = 1;

        for(int i = 2; i <= N; i++){
            temp = f0 + f1;
            f0 = f1;
            f1 = temp;
        }

        System.out.println(temp);
    }
}


// 피보나치 수

// 다른 버전

package BOJ;

import java.util.Scanner;

public class Main_2747 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        System.out.println(sum(N));
    }

    public static int sum(int N){
        if(N == 0){
            return 0;
        }
        if(N == 1){
            return 1;
        }

        return sum(N-1) + sum(N-2);
    }
}
