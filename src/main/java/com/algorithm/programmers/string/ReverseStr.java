package com.algorithm.programmers.string;

import java.util.Arrays;

public class ReverseStr {
    /**
     * Arrays.sort() 를 이용하여 정렬 (오름차순 정렬)
     * 오름차순 정렬된 것을 뒤집기 위해 StringBuilder의 reverse() 메소드 사용
     * TimeComplexity : O(n log n)
     * SpaceComplexity : O(1)
     * */
    public String solution(String str){
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return new StringBuilder(new String(charArr)).reverse().toString();
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.solution("Zbcdefg") );
    }
}
