//package com.algorithm.leetcode.stack;
//
//import java.util.*;
//
//public class ValidParentheses {
//    public static Map<Character, Character> map = new HashMap<>();
//
//    static {
//        map.put(')', '(');
//        map.put('}', '{');
//        map.put(']', '[');
//    }
//
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//
//        for (char ch : s.toCharArray()) {
//            if (ch == '(' || ch == '{' || ch == '[') {
//                stack.push(ch);
//            } else if (stack.isEmpty() || stack.pop() != map.get(ch)) {
//                return false;
//            }
//        }
//
//        return stack.isEmpty();
//    }
//}
