package com.algorithm.boj.math;

import java.util.Scanner;

/**
 * 시간 복잡도 : O(n)
 */
public class Q17427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;

        for (int i=1; i<=n; i++) {
            int cnt = n / i;
            sum += (cnt * i);
        }

        System.out.println(sum);    }
}
