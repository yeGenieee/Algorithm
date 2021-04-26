package com.algorithm.boj.bruteforce;

import java.util.Scanner;

public class Q15649 {
    static boolean[] check = new boolean[10];
    static int[] arr = new int[10];

    public static void go(int index, int n, int m) {
        if (index == m) {
            // 출력
            for (int i=0; i<m; i++) {
                System.out.print(arr[i]);

                if (i != m-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            return;
        }

        for (int i=1; i<=n; i++) {
            if (check[i]) {
                continue;
            }
            check[i] = true;
            arr[index] = i;
            go(index+1, n, m);
            check[i] = false;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        go(0, n, m);
    }
}
