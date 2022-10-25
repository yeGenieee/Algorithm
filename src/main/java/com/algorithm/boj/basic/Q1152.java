package com.algorithm.boj.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(input, " ");

        System.out.println(st.countTokens());
    }
}
