package com.algorithm.boj.dp1;

import java.util.Scanner;

public class Q9095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        int[] result = new int[11];
        result[1] = 1;
        result[2] = 2;
        result[3] = 4;

        for (int i=0; i<T; i++) {
            int n = scanner.nextInt();

            for (int j=4; j<=n; j++) {
                result[j] = result[j-1] + result[j-2] + result[j-3];
            }

            System.out.println(result[n]);
        }
    }
}
