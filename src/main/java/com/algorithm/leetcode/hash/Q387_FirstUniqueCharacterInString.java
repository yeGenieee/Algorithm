package com.algorithm.leetcode.hash;

import java.util.*;

public class Q387_FirstUniqueCharacterInString {
    /***
     * hashMap을 이용하여 빈도수 체크
     * TimeComplexity : O(n)
     * SpaceComplexity : O(n)
     * */
    public int firstUniqChar(String s) {
        int answer = s.length();
        Map<Character, Integer> cntMap = new HashMap<Character, Integer>();

        for (char ch : s.toCharArray()) {
            cntMap.put(ch, cntMap.getOrDefault(ch,0) + 1);
        }

        if (cntMap.size() == 0 || !(cntMap.containsValue(1))) {
            return -1;
        }

        for (char key : cntMap.keySet()) {
            if (cntMap.get(key) == 1) {
                int idx = s.indexOf(key);
                answer = Math.min(idx, answer);
            }
        }

        return answer;
    }
}
