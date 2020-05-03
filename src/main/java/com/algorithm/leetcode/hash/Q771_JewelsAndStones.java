package com.algorithm.leetcode.hash;

public class Q771_JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int cnt = 0;
        // J의 길이만큼 - 각 S의 길이만큼 J와 S의 글자 비교하여 같으면 cnt++
        for (int i=0; i<J.length(); i++) {
            for (int j=0;j<S.length(); j++) {
                if (J.charAt(i) == S.charAt(j)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
