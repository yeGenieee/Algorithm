package com.algorithm.boj.basic;

import java.util.Scanner;

public class Q1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int[] frequency = new int[26];

        input = input.toUpperCase();

        for (int i = 0; i < input.length(); i++) {
            int ch = input.charAt(i);
            frequency[ch - 65]++;
        }

        int max = frequency[0];
        int idx = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > max) {
                max = frequency[i];
                idx = i;
            }
        }

        boolean isOnly = true;
        for (int i = 0; i < frequency.length; i++) {
            if (i != idx && frequency[i] == max) {
                isOnly = false;
                break;
            }
        }

        System.out.println(isOnly ? (char) (idx + 65) : '?');
    }
}
