package com.algorithm.programmers.math;

import java.util.Arrays;

public class KthNumber {
    /**
     * 입력받는 다차원 배열인 commands 배열을 반복하면서 -> 기존 array배열의 subArray를 구함 (Arrays.copyOfRange로 copy)
     * subArray를 정렬한 뒤(Arrays.sort 이용), k번째 인덱스 값을 result 배열에 넣음
     * TimeComplexity : O(n) - commands 배열의 길이만큼
     * SpaceComplexity : O(1)
     * */
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int r = 0; r < commands.length; r++) {
            int i = commands[r][0];
            int j = commands[r][1];
            int k = commands[r][2];
            int[] subArray = Arrays.copyOfRange(array,i-1,j);
            Arrays.sort(subArray);
            answer[r] = subArray[k-1];
        }

        return answer;
    }
}
