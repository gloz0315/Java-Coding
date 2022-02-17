import java.util.Scanner;

public class ArrayEquals {
    static boolean equals(int[] a, int[] b){
        if(a.length != b.length)
            return false;

        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i])
                return false;
        }

        return true;
    }

    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a의 배열의 숫자: "); int a_num = stdIn.nextInt();
        int[] a = new int[a_num];

        for(int i = 0; i < a.length; i++){
            System.out.print("숫자를 입력하세요: ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("b의 배열의 숫자: "); int b_num = stdIn.nextInt();
        int[] b = new int[b_num];

        for(int i = 0; i < b.length; i++){
            System.out.print("숫자를 입력하세요: ");
            b[i] = stdIn.nextInt();
        }

        System.out.println("배열 a와 b는 " + (equals(a,b) ? "같습니다" : "같지 않습니다." ));
    }
}
