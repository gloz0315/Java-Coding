package BOJ;

import java.util.Scanner;

public class Main_2579 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] floor = new int[301];
        int[] cache = new int[301];

        for(int i = 1; i <= N; i++){
            floor[i] = input.nextInt();
        }

        cache[1] = floor[1];
        cache[2] = floor[1] + floor[2];
        cache[3] = Math.max(floor[1], floor[2]) + floor[3];

        for(int i = 4; i <=N; i++){
            cache[i] = Math.max(cache[i-3]+floor[i-1], cache[i-2]) + floor[i];
        }

        System.out.println(cache[N]);
    }
}

// 계단 오르기 
