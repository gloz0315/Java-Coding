// 프로그래머스 Level 2 문제에서 가장 큰 수 찾기

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] units = new String[numbers.length];         

        for(int i = 0; i < numbers.length; i++){
            units[i] = Integer.toString(numbers[i]);    // 숫자를 문자열로 변환해서 배열에 넣기
        }

        Arrays.sort(units, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {          // 비교 연산 ( 이것에 대해 공부를 좀 더 하기 )
                                                                // 내림차순을 통해 큰 수를 찾기
                return ((o2 + o1).compareTo(o1 + o2));
            }
        });

        for(String a : units)                            //  정렬을 통해 나온 값을 다 더하기
            answer += a;

        return answer.charAt(0) == '0' ? "0" : answer;       // 만약 예시로 0,0,0 을 통해 000이 나온다면 0으로 표현해야 하므로

    }
}


// 다른 풀이

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] units = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            units[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(units, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return ((o2 + o1).compareTo(o1 + o2));
            }
        });

        if(units[0].equals("0")){
            return "0";
        }

        for(String a : units)
            answer += a;

        return answer;

    }
}
