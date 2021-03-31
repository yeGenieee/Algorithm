package com.algorithm.boj.math;

import java.util.Scanner;

public class Q1929 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else if (num == 2) {
            return true;
        }

        for (int i=2; i*i<=num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i=m; i<=n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
