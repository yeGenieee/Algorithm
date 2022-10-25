package com.algorithm.leetcode.hash;

import java.util.*;

public class Q771_JewelsAndStones {
    /**
     * 이중 for문을 이용한 풀이
     * TimeComplexity : O(m * n)
     * SpaceComplexity : O(1)
     * */
//    public int numJewelsInStones(String J, String S) {
//        int cnt = 0;
//        // J의 길이만큼 - 각 S의 길이만큼 J와 S의 글자 비교하여 같으면 cnt++
//        for (int i=0; i<J.length(); i++) {
//            for (int j=0;j<S.length(); j++) {
//                if (J.charAt(i) == S.charAt(j)) {
//                    cnt++;
//                }
//            }
//        }
//        return cnt;
//    }

    /**
     * Set을 이용한 풀이
     * TimeComplexity : O(m + n + 1) => O(m + n)
     * SpaceComplexity : O(1) (Set의 최대 크기 => 2*26)
     * */
    public int numJewelsInStones(String J, String S) {
        int cnt = 0;
        Set<Character> jewelSet = new HashSet<Character>();

        for (char ch : J.toCharArray()) {
            jewelSet.add(ch); // O(m)
        }

        for (char ch : S.toCharArray()) { // O(n)
            if (jewelSet.contains(ch)) { // O(1)
                cnt++;
            }
        }

        return cnt;
    }
}
