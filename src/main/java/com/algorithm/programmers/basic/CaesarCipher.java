package com.algorithm.programmers.basic;

public class CaesarCipher {
    public String solution(String s, int n) {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";

        StringBuffer sb = new StringBuffer();

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            int index = n;
            if (ch == ' ') {
                sb.append(" ");
            } else if (Character.isUpperCase(ch)) {
                index += upperCase.indexOf(ch);
                sb.append(upperCase.charAt(index % 26));
            } else {
                index += lowerCase.indexOf(ch);
                sb.append(lowerCase.charAt(index % 26));
            }
        }

        return sb.toString();
    }

    public String solution2(String s, int n) {
        String answer = "";

        n = n % 26;

        for (int i=0; i< s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }

            answer += ch;
        }

        return answer;
    }
}
