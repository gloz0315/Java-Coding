import java.util.Scanner;

public class Copy {
    static void copy(int[] a, int[] b){
        int num = a.length <= b.length? a.length : b.length; // 여기서의 의미가 a의 배열의 길이가 b의 배열의 길이보다 작으면 a의 배열 길이만큼 num의 숫자를 정하고
                                                             // 반대로 a의 배열의 길이가 b보다 크다면 작은 b의 배열 길이만큼 num의 숫자로 정한다.

        for(int i = 0; i < num; i++){
            a[i] = b[i]; // a의 배열을 b에 복사한다.
        }
    }

    static void rcopy(int[] a, int[] b){
        int num = a.length <= b.length ? a.length : b.length;

        for(int i = 0; i < num; i++){
            a[i] = b[b.length-i-1]; // a의 배열을 b에 역순으로 복사.
        }
    }

    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a의 배열에 몇개의 숫자를 넣으실건가요? "); int num = stdIn.nextInt();
        int[] a = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("a의 배열의 " + (i+1) + "번째에 넣을 숫자를 입력하세요: ");
            a[i] = stdIn.nextInt();
        }

        System.out.println("a 배열의 결과");
        for(int i = 0; i < num; i++){
            System.out.println("a[" + (i+1) +"] = " + a[i]);
        }

        System.out.print("b의 배열에 몇개의 숫자를 넣으실건가요? "); int num_1 = stdIn.nextInt();
        int[] b = new int[num_1];

        for(int i = 0; i < num_1; i++){
            System.out.print("b의 배열의 " + (i+1) + "번째에 넣을 숫자를 입력하세요: ");
            b[i] = stdIn.nextInt();
        }
        System.out.println("b 배열의 결과");
        for(int i = 0; i < num_1; i++){
            System.out.println("b[" + (i+1) +"] = " + b[i]);
        }

        copy(a,b);

        System.out.println("a 배열에 b 배열을 복사");
        for(int i = 0; i < num; i++){
            System.out.println("a[" + (i+1) +"] = " + a[i]);
        }

    }
}
