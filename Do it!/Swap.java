import java.util.Scanner;

public class Swap {
    static void swap(int[] a,int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;

    }

    static void reverse(int[] a){
        for(int i = 0; i < a.length / 2; i++){
            swap(a,i,a.length-i-1);
        }
    }

    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("몇 개의 숫자를 입력하시겠습니까? :");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for(int i = 0; i < x.length; i++){
            System.out.print("숫자를 입력하세요: ");
            x[i] = stdIn.nextInt();
            System.out.println("x[" + i + "] : " + x[i]);
        }


        System.out.println("역순으로 바꾸겟습니다.");
        reverse(x);

        for(int i = 0; i < x.length; i++){
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }
}
