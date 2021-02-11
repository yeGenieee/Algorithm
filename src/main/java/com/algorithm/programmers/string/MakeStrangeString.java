package com.algorithm.programmers.string;

public class MakeStrangeString {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        int index = 0;

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                index = 0;
                sb.append(" ");
            } else if (index % 2 == 0) {
                sb.append(Character.toString(ch).toUpperCase());
                index++;
            } else if (index % 2 == 1) {
                sb.append(Character.toString(ch).toLowerCase());
                index++;
            }
        }
        return sb.toString();
    }
}
