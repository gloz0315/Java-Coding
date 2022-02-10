import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String x;
        String[] a;
        x = input.nextLine();
        a = x.split("\\.");

        int a1 = Integer.parseInt(a[0]);
        int a2 = Integer.parseInt(a[1]);
        int a3 = Integer.parseInt(a[2]);

        System.out.printf("%04d.%02d.%02d",a1,a2,a3);
    }
}


// 자바에서 문자열 자르기 split함수를 통해 표현
// split의 인자로 들어가는 String 토큰이 regex 정규식이기 때문에 여기서 .은 정규식에서 무작위의 한 글자를 의미
// 따라서 .을 중심으로 문자열을 나누기 위해서는 escape 문자를 앞에 써줘야 하는데 여기서 \\ 두개를 써야 정규식쪽에서 \.라고 인식을 하고
// 실제 . 을 찾게 되는 것

// Integer.parseInt는 문자열을 숫자로 변환시키는 방법인 함수
// 즉 a1이라는 인트 변수 안에 Integer.parseInt 함수를 써서 a라는 변수 안에 저장되어있는 문자열을 . 기준으로 나눈 리스트 형식으로 각각 표현
