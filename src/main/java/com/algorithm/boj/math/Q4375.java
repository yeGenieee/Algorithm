package com.algorithm.boj.math;

import java.util.Scanner;

public class Q4375 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int num = 0;

            for (int i=1;;i++) {
                num = num * 10 + 1;
                num = num % n;
                if (num == 0) { // 나누어 떨어지는 경우, 즉, 1로 이루어진 n의 배수를 찾은 경우
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
