package com.algorithm.boj.datastructure1.stack;

import java.util.*;

public class Q10828 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input 첫째줄에 주어지는 명령의 수 N
        sc.nextLine();

        Stack<Integer> stack = new Stack<Integer>(); // 정수를 저장하는 스택 stack

        for (int i=0; i<n; i++) {
            String str = sc.nextLine();
            String[] first = str.split(" ");
            String cmd = first[0];

            if (cmd.equals("push")) {
                int num = Integer.parseInt(first[1]);
                stack.push(num);
            } else if (cmd.equals("pop")) {
                if (stack.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.pop());
                }
            } else if (cmd.equals("size")) {
                System.out.println(stack.size());
            } else if (cmd.equals("empty")) {
                if (stack.empty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (cmd.equals("top")) {
                if (stack.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.peek());
                }
            }
        }

    }
}
