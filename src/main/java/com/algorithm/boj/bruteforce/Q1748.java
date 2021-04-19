package com.algorithm.boj.bruteforce;

import java.util.Scanner;

public class Q1748 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long answer = 0;

        for (int start=1,len=1; start <= n; start*=10, len++) {
            int end = start * 10 - 1;

            if (end > n) {
                end = n;
            }

            answer += (long) (end - start + 1) * len;
        }

        System.out.println(answer);
    }
}
