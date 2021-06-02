package com.algorithm.programmers.simulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class MaxNumericExpression {
    static char[] opers; // 연산자만 담음
    static long answer;
    static String exp; // 입력으로 들어온 연산식

    public static long solution(String expression) {
        exp = expression;

        // 1. 연산의 우선 순위 정하기
        // 연산 수식에 포함된 연산만을 찾아서 operation에 추가
        List<Character> operation = new ArrayList<>();
        if (expression.contains("+")) {
            operation.add('+');
        }
        if (expression.contains("-")) {
            operation.add('-');
        }
        if (expression.contains("*")) {
            operation.add('*');
        }

        // char array에 담아 dfs 돌리기
        opers = new char[operation.size()];
        for (int i = 0; i < opers.length; i++) {
            opers[i] = operation.get(i);
        }

        answer = -1;
        simulation(0);
        return answer;
    }

    /**
     * dfs로 연산자 조합 만들기
     * @param depth
     */
    static void simulation(int depth) {
        if (depth == opers.length) {
            long ret = calculate();
            answer = Math.max(ret, answer);
            return;
        }

        for (int i = depth; i < opers.length; i++) {
            swap(i, depth);
            simulation(depth + 1);
            swap(i, depth);
        }
    }

    static void swap(int i, int j) {
        char c = opers[i];
        opers[i] = opers[j];
        opers[j] = c;
    }

    /**
     * 연산 수식을 우선 순위에 맞춰서 후위 표현식으로 바꿈
     * @return
     */
    static long calculate() {
        HashMap<String, Integer> hm = new HashMap<>(); // 우선순위를 계산해서 담아둠

        for (int i = 0; i < opers.length; i++) {
            hm.put(opers[i] + "", i);
        }

        StringBuilder sb = new StringBuilder(); // 숫자를 담기 위함
        List<String> equation = new ArrayList<>(); // 후위 연산식
        Stack<String> arg = new Stack<>(); // 연산자

        int len = exp.length(); // input으로 들어온 연산식 길이


        for (int i = 0; i < len; i++) {
            char c = exp.charAt(i); // 연삭식에 들어온 문자 하나

            // 전체 문자열을 돌면서, 숫자는 바로 삽입, 연산자는 우선 순위에 맞춰서 삽입
            if (c == '+' || c == '-' || c == '*') {
                equation.add(sb.toString());
                sb.delete(0, sb.length());

                while (!arg.isEmpty() && hm.get(c+"") <= hm.get(arg.peek())) {
                    equation.add(arg.pop());
                }
                arg.push(c + "");
            } else {
                sb.append(c);
            }
        }

        equation.add(sb.toString());

        // 후위 연산식 만들기
        while (!arg.isEmpty()) {
            equation.add(arg.pop());
        }

        // 전체 연산
        Stack<Long> value = new Stack<>();
        for (String e : equation) {
            if (hm.containsKey(e)) {
                long b = value.pop();
                long a = value.pop();
                if (e.equals("+")) {
                    value.push(a + b);
                }
                if (e.equals("-")) {
                    value.push(a - b);
                }
                if (e.equals("*")) {
                    value.push(a * b);
                }
            } else {
                value.push(Long.parseLong(e));
            }
        }
        return Math.abs(value.pop()); // 절대값 계산
    }
}
