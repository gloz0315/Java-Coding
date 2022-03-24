package BOJ;
import java.util.*;

public class Main_1764 {
    public static void main(String args[]){
        HashMap<String,Integer> numberList = new HashMap<>();
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();
        String[] num1 = new String[N];
        String[] num2 = new String[M];
        for(int i = 0; i < N; i++){
            num1[i] = input.next();
        }
        for(int i = 0; i < M; i++){
            num2[i] = input.next();
        }

        for(String player : num1){
            numberList.put(player,numberList.getOrDefault(player,0) + 1);
        }

        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < num2.length; i++){
            if(numberList.containsKey(num2[i])){
                result.add(num2[i]);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }

    }
}
