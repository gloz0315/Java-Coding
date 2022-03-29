package BOJ;

import java.util.*;

public class Main_1181 {


    public static void main(String[] args) {

        ArrayList<String> word1 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String[] wordList = new String[N];

        for(int i = 0; i < N; i++){
            wordList[i] = input.next();
        }

        for(String word : wordList){
            if(!word1.contains(word)){
                word1.add(word);
            }
        }

        Collections.sort(word1);

        word1.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });

        for(int i = 0; i < word1.size(); i++){
            System.out.println(word1.get(i));
        }
    }
}
