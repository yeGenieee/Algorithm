package com.algorithm.boj.datastructure1.stack;

import java.util.Scanner;
import java.util.Stack;

public class Q10799 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String input = stdIn.nextLine();

        System.out.println(countStick(input));
    }

    public static int countStick(String str) {
        int cnt=0;
        char ch;

        Stack<Integer> stack = new Stack<Integer>(); // 스택에 괄호 문자열을 넣는 대신, (의 인덱스를 넣음

        for (int i=0;i<str.length();i++) {
            ch = str.charAt(i);

            if (ch == '(') { // 왼쪽 괄호가 나오는 경우 --> 레이저일수도 있고, 쇠막대기일 수도 있음 (일단 둘 다 스택에 push)
                stack.push(i);
            } else { // 오른쪽 괄호가 나오는 경우
                if (stack.peek() + 1 == i) { // 왼쪽 괄호의 인덱스가 지금 들어온 오른쪽 괄호와 1 차이 나는 경우 --> 레이저임
                    stack.pop();
                    cnt += stack.size(); // 잘려진 막대기 개수
                } else { // 레이저가 아닌 경우 (그냥 쇠 막대기의 오른쪽 끝)
                    stack.pop();
                    cnt++; // 쇠막대기의 꽁다리 개수 더함
                }
            }
        }

        return cnt;
    }
}
