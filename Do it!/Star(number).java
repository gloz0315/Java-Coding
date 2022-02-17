import java.util.Scanner;

public class Spria {
    static void spira(int n){
        for(int i = 1; i < n+1; i++){
            for(int j = 0; j < n-i; j++)
                System.out.print(" ");
            for(int j = 0; j < 2*(i-1)+1; j++)
                System.out.print(i % 10);

        System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);

        int n;
        System.out.print("숫자를 입력하세요: "); n = stdIn.nextInt();
        spira(n);
    }
}
