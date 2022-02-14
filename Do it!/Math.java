import java.util.Scanner;

public class sumWhile {
    static int sum(int a){

        int i = 1;
        int sum = 0;

        while(i <= a){
            sum += i;
            i++;
        }

        return sum;
    }

    static int sum1(int a){
        int num = (1 + a)*5;

        return num;
    }

    static int sumOf(int a, int b){
        int sum1 = 0;
        int sum2 = 0;
        int total = 0;

        for(int i = 0; i <= a; i++)
            sum1 += i;

        for(int j = 0; j <=b; j++)
            sum2 += j;

        if(sum1 >= sum2)
            total = sum1-sum2;
        else
            total = sum2-sum1;

        return total;



    }

    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("숫자를 적으세요: "); int num = stdIn.nextInt();
        System.out.println("1 부터 " + num + " 까지의 합은 " + sum(num) + " 입니다.");
        System.out.println("가우스 공식을 이용한 1부터 " + num + " 까지의 합은 " + sum1(num) + " 입니다.");

        System.out.println("숫자 두개를 적으세요: ");
        int num1 = stdIn.nextInt(); int num2 = stdIn.nextInt();
        System.out.println("두 숫자의 0부터 " + num1 +" 그리고 " + num2 + "의 합의 차는 " + sumOf(num1,num2) + " 입니다.");


    }
}
