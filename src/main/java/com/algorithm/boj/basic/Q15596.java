package com.algorithm.boj.basic;

import java.util.Scanner;

public class Q15596 {
    public long sum(int[] a) {
        long ans = 0;

        for (int current : a) {
            ans += current;
        }

        return ans;
    }
}
