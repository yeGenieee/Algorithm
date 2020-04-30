package com.algorithm.boj.datastructure1.stack;

import java.util.Stack;
import java.io.*;

public class Q9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(num-- > 0) {
            String sentence = bf.readLine() + "\n";
            Stack<Character> stack = new Stack<>();

            for (char ch : sentence.toCharArray()) {
                if (ch == ' ' || ch == '\n') {
                    while(!stack.isEmpty()) {
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