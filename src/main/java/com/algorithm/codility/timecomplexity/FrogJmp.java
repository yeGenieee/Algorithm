package com.algorithm.codility.timecomplexity;

public class FrogJmp {
//    public int solution(int X, int Y, int D) {
//        int currentPos = X;
//        int cnt = 0;
//
//        while (X <= Y) {
//            ++cnt;
//            X += D;
//        }
//
//        return cnt;
//    }

    public int solution(int X, int Y, int D) {
        int distance = Y - X;
        if (distance <= 0) {
            return 0;
        }

        return Math.ceil((double) distance / D);
    }
}
