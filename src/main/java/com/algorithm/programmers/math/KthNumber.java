package com.algorithm.programmers.math;

import java.util.Arrays;

public class KthNumber {
    /**
     * 입력받는 다차원 배열인 commands 배열을 반복하면서 -> 기존 array배열의 subArray를 구함 (Arrays.copyOfRange로 copy)
     * Arrays.copyOfRange 이용할 때는 copyOfRange(복사할 배열, 시작 인덱스, 끝 인덱스(해당 인덱스는 미포함)) 을 주의하자
     * subArray를 정렬한 뒤(Arrays.sort 이용), k번째 인덱스 값을 result 배열에 넣음
     * TimeComplexity : O(n) - commands 배열의 길이만큼
     * SpaceComplexity : O(1)
     * */
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int r = 0; r < commands.length; r++) {
//            int i = commands[r][0];
//            int j = commands[r][1];
//            int k = commands[r][2];
            // i, j, k 변수 선언하지 않고도 풀 수 있음
            int[] subArray = Arrays.copyOfRange(array,commands[r][0]-1,commands[r][1]);
            Arrays.sort(subArray);
            answer[r] = subArray[commands[r][2]-1];
        }

        return answer;
    }
}
