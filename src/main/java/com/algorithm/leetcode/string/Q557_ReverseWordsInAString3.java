package com.algorithm.leetcode.string;

public class Q557_ReverseWordsInAString3 {
    public String reverseWords(String s) {
        String answer = "";

        String[] splitArray = s.split(" ");

        for(int i=0; i<splitArray.length; i++) {
            StringBuilder sb = new StringBuilder(splitArray[i]);
            sb = sb.reverse();
            if (i != splitArray.length-1) {
                answer = answer + sb.toString() + " ";
            } else {
                answer = answer + sb.toString();
            }
        }

        return answer;
    }
}
