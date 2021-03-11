package com.algorithm.boj.math;

import java.util.*;

public class Q10430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println((a + b) % c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b) % c);
        System.out.println(((a%c) * (b%c))%c);
    }
}
