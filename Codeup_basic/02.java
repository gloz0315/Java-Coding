import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String number;
        String[] a;
        number = input.next();
        a = number.split("\\-");
        String a1 = String.valueOf(a[0]);
        String a2 = String.valueOf(a[1]);
        System.out.print(a1+a2);
    }
}

// 저번에는 문자열을 int형으로 변환하는 Integer.parseInt를 통해 문자열을 바꾼것이라면 이번에는 문자열로 변환하는 것
// String ( 문자열 ) 과 valueOf을 통해 문자열로 변환
