package com.algorithm.programmers.math;

public class getGcdLcm {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = getGCD(n,m);
        answer[1] = (n * m) / answer[0];

        return answer;
    }

    public int getGCD(int n, int m) {
        while ( m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
}
