package com.algorithm.programmers.math;

public class SumBetweenTwoNumbers {
    /**
     * TimeComplexity : O(n)
     * SpaceComplexity : O(1)
     * */
    public long solution(int a, int b) {
        long answer = 0;

        for (int i=Math.min(a,b); i<=Math.max(a,b); i++) {
            answer +=i;
        }
        return answer;
    }

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a,b), Math.max(a,b));
    }

    public long sumAtoB(int min, int max) {
        return (max - min + 1) * (min + max) / 2;
    }
}
