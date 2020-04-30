package com.algorithm.boj.datastructure1.stack;

import java.util.Stack;
import java.util.Scanner;

public class Q9012 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int T = stdIn.nextInt();
        stdIn.nextLine();

        while(T-- > 0) {
            System.out.println(isValidPS(stdIn.nextLine()));
        }
    }

    public static String isValidPS(String ps) {
        String result="NO";

        Stack<String> stack = new Stack<String>();

        for(int i=0;i<ps.length();i++) {
            if (ps.charAt(i) == '(') {
                stack.push(Character.toString(ps.charAt(i)));
            } else {
                if (!stack.isEmpty()) {
                    if (stack.pop().equals("(")) {
                        result = "YES";
                    } else {
                        return "NO";
                    }
                } else {
                    return "NO";
                }
            }
        }
        if (!stack.isEmpty()) {
            return "NO";
        }

        return result;
    }

    // BufferedReader를 이용한 풀이
    /*
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        while (num-- > 0) {
            String str = bf.readLine();
            System.out.println(isValidPS(str));
        }
    }

    public static String isValidPS(String str) {
        String result = "NO";

        Stack<Character> stack = new Stack<>();
        if (str.length() % 2 != 0) {
            return "NO";
        }
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    if (stack.pop() == '(') {
                        result = "YES";
                    } else {
                        return "NO";
                    }
                }
            }
        }
        if (!stack.isEmpty()) {
            return "NO";
        }

        return result;
    } */

    /**
     * 스택이 아닌 스택의 사이즈만을 이용한 풀이
     * */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//
//        while(num-- > 0) {
//            System.out.println(isValidPS(sc.next()));
//        }
//    }
//
//    public static String isValidPS(String str) {
//        int size = 0;
//        if (str.length() % 2 != 0) {
//            return "NO";
//        }
//
//        for (int i=0; i < str.length(); i++) {
//            if (str.charAt(i) == '(') {
//                size++;
//            } else {
//                size--;
//            }
//            if (size < 0) {
//                return "NO";
//            }
//        }
//
//        if (size == 0) {
//            return "YES";
//        } else {
//            return "NO";
//        }
//    }

}
