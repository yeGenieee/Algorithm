package com.algorithm.leetcode.string;

public class Q520_DetectCapital {
    /**
     * 정규 표현식 이용
     * TimeComplexity : O(n) ( O(1) ~ O(2^n) )
     * SpaceComplexity : O(1)
     * */
    public boolean detectCapitalUse3(String word) {
        return word.matches("[A-Z]*|.[a-z]*");
    }

    /**
     * word 길이가 1인 경우는 대문자인지 소문자인지에 관계없이 모두 true
     * 첫번쨰 글자 & 두번째 글자가 모두 대문자이면 뒤에 글자들도 대문자인지 확인
     * 첫번쨰 글자 & 두번째 글자 중 하나라도 소문자 -> 뒤에 글자들 중 대문자 나오면 바로 false
     * TimeComplexity : O(n) (word의 길이 n만큼)
     * SpaceComplexity : O(1)
     * */
    public boolean detectCapitalUse2(String word) {
        int len = word.length();
        if (len == 1) {
            return true;
        }

        // All letters in this word are capitals
        if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            for (int i = 2; i < len; i++) {
                if (Character.isLowerCase(word.charAt(i))) {
                    return false;
                }
            }
        } else { // All letters in this word are not capitals or Only first letter in this word is capital
            for (int i = 1; i < len; i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * isUpperCase & isLowerCase를 활용하여 현재 글자가 대문자 / 소문자인지 확인
     * TimeComplexity : O(n) (word 의 길이 n만큼)
     * */
    public boolean detectCapitalUse(String word) {
        int len = word.length();

        boolean matchedCase1 = true, matchedCase2 = true, matchedCase3 = true;

        // All letters in this word are capitals ex) USA
        for (int i = 0; i < len; i++) {
            if (!Character.isUpperCase(word.charAt(i))) {
                matchedCase1 = false;
                break;
            }
        }
        if (matchedCase1) {
            return true;
        }

        // All letters in this word are not capitals ex) leetcode
        for (int i = 0; i < len; i++) {
            if (!Character.isLowerCase(word.charAt(i))) {
                matchedCase2 = false;
                break;
            }
        }
        if (matchedCase2) {
            return true;
        }

        // Only first letter in this word is capital ex) Google
        if (!Character.isUpperCase(word.charAt(0))) {
            matchedCase3 = false;
        }
        if (matchedCase3) {
            for (int i = 1; i < len; i++) {
                if (!Character.isLowerCase(word.charAt(i))) {
                    matchedCase3 = false;
                    break;
                }
            }
        }
        if (matchedCase3) {
            return true;
        }

        return false;
    }
}
