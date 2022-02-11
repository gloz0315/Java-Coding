import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String s;
        s = input.next();

        int [] data = new int[s.length()];


        for(int i=0; i < data.length; i++){
            data[i] = s.charAt(i)-'0';
        }

        for(int j=0; j<5; j++){
            System.out.println("["+data[j]*((int)Math.pow(10,4-j))+"]");
        }

    }
}

// 문자열에서 숫자로
// 숫자에서 문자열로 바꾸는 방법에 대해서 다시 공부해볼것
// 숫자에서 하나,하나 가져올 땐, 문자열로 바꾼 뒤에 배열을 이용할것

// 또 다른 방법으로는 문자열로 숫자를 받아와서 배열을 이용해서 숫자로 변환
