package com.algorithm.boj.datastructure1.stack;

import java.io.*;
import java.util.*;

public class Q9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        Stack<Character> stack = new Stack<>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (num-- > 0) {
            String input = bf.readLine() + "\n";
            for (char ch : input.toCharArray()) {
                if (ch == ' ' || ch == '\n') {
                    while (!stack.isEmpty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(ch);
                } else {
                    stack.push(ch);
                }
            }
        }
        bw.flush();
    }
}