package com.algorithm.programmers.string;

public class WaterMelon {
    /*
     * 짝수번째 인덱스 -> 수 append
     * 홀수번째 인덱스 -> 박 append
     * TimeComplexity : O(n)
     * SpaceComplexity : O(1)
     * */
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            if (i % 2 == 0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }
        answer = sb.toString();
        return answer;
    }
}
