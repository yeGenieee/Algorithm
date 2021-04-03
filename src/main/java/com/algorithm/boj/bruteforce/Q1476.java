package com.algorithm.boj.bruteforce;

import java.util.Scanner;

public class Q1476 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int E = scanner.nextInt();
        int S = scanner.nextInt();
        int M = scanner.nextInt();

        int e = 1, s = 1, m = 1;
        for (int i=1;; i++) {
            if (e == E && s == S && m == M) {
                System.out.println(i);
                break;
            }
            e++;
            s++;
            m++;

            if (e == 16) {
                e = 1;
            }
            if (s == 29) {
                s = 1;
            }
            if (m == 20) {
                m = 1;
            }
        }

    }
}
