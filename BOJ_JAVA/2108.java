package BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main_2108 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] numberList = new int[N];

        for(int i = 0; i < N; i++){
            numberList[i] = input.nextInt();
        }

        System.out.println(Avg(numberList));
        System.out.println(Middle(numberList));
        System.out.println(Most(numberList));
        System.out.println(Sub(numberList));
    }

    public static int Avg(int[] num){
        double count = 0;

        for(int i = 0; i < num.length; i++){
            count += num[i];
        }
        count = count/num.length;

        return (int)Math.round(count);
    }

    public static int Middle(int[] num){
        ArrayList<Integer> numberList = new ArrayList<>();
        for(int i = 0; i < num.length; i++){
            numberList.add(num[i]);
        }

        Collections.sort(numberList);

        return numberList.get(numberList.size()/2);
    }

    public static int Most(int[] num){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        ArrayList<Integer> numberList = new ArrayList<>();
        int numbers = 0;
        int Mode = 0;

        for(int i = 0; i < num.length; i++){
            hashMap.put(num[i],hashMap.getOrDefault(num[i], 0) + 1);
        }
        for(int key : hashMap.values()){
            numbers = Math.max(numbers,key);
        }

        for(int key : hashMap.keySet()){
            if(hashMap.get(key) == numbers){
                numberList.add(key);
            }
        }

        Collections.sort(numberList);
        if(numberList.size() >= 2){
            Mode = numberList.get(1);
        }else{
            Mode = numberList.get(0);
        }

        return Mode;
    }

    public static int Sub(int[] num){
        ArrayList<Integer> numberList = new ArrayList<>();
        for(int i = 0; i < num.length; i++){
            numberList.add(num[i]);
        }
        Collections.sort(numberList);

        return numberList.get(numberList.size()-1) - numberList.get(0);
    }


}


// 백준 통계학 문제에 대한 
