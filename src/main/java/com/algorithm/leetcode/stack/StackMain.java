package com.algorithm.leetcode.stack;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        for (int i=0; i<4; i++) {
            if (!stack.isEmpty()) {
                System.out.println(stack.top());
            }

            System.out.println(stack.pop());
        }
    }
}
