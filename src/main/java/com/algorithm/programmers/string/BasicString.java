package com.algorithm.programmers.string;

public class BasicString {
    /**
     * 정규표현식을 이용하여 문자열 s가 숫자로만 구성되어있는지 확인
     * TimeComplexity : O(1)
     * SpaceComplexity : O(1)
     * */
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            return s.matches("^[0-9]*$");
        }
        return false;
    }
}
