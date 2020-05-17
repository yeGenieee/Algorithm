package com.algorithm.programmers.basic;

import java.util.Arrays;

public class DivisorArray {
    /*
    * arr 배열을 stream으로 반복하면서 -> divisor로 나누어 떨어지는 배열 원소만 필터링
    * 필터링 한 배열을 정렬하여 리턴 (나누어 떨어지는 원소 없으면 -1 을 배열에 담아 리턴)
    * TimeComplexity : O(n)
    * SpaceComplexity : O(1)
    * */
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        answer = Arrays.stream(arr)
                .filter(item -> item % divisor == 0)
                .toArray();

        Arrays.sort(answer);

        if (answer.length == 0) {
            answer = new int[]{-1};
        }

        return answer;
    }
}
