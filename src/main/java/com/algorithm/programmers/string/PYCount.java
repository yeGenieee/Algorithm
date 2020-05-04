package com.algorithm.programmers.string;

public class PYCount {
    /**
     * P와 Y를 만나면 각자 Cnt 증가
     * TimeComplexity : O(n)
     * SpaceComplexity : O(1)
     * */
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;

        for (char ch : s.toCharArray()) {
            String str = Character.toString(ch);
            if (str.equalsIgnoreCase("p")) {
                pCnt++;
            } else if (str.equalsIgnoreCase("y")) {
                yCnt++;
            }
        }

        if (pCnt == yCnt) {
            return true;
        }

        return false;
    }
}
