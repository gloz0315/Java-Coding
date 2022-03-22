import java.util.Arrays;
import java.util.Scanner;

public class Main_11650 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[][] numList = new int[N][2];

        for(int i = 0; i < N; i++){
            numList[i][0] = input.nextInt();
            numList[i][1] = input.nextInt();
        }
      
      // int[][] 의 비교대상 요소 o1,o2는 각각 int[] 타입
        Arrays.sort(numList, (o1, o2) -> {
            if(o1[0] == o2[0])               // x좌표의 값이 같다면 y좌표를 기준으로 정렬
                return Integer.compare(o1[1], o2[1]);
            else                                        
                return Integer.compare(o1[0], o2[0]);   // 나머지는 x 좌표를 기준으로 정렬
        });

        for(int[] arr : numList){
            System.out.println(arr[0] + " " + arr[1]);
        }

    }
}


// 여기서 가장 중요한 부분은 Arrays.sort(numList, (o1,o2) -> 의 람다식 코딩이 아닐까 싶다.
// 이 부분에 대해 더 구체적으로 공부를 해야겠다.
