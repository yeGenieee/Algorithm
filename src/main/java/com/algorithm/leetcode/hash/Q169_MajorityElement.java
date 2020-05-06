package com.algorithm.leetcode.hash;

import java.util.*;

public class Q169_MajorityElement {
    /**
     * 빈도수를 hashmap에 저장
     * 가장 큰 빈도수를 찾고 -> hashMap을 돌며 가장 큰 빈도수에 해당하는 key를 찾아서 리턴
     * TimeComplexity : O(n)
     * SpaceComplexity : O(n)
     */
    public int majorityElement(int[] nums) {
        int answer = 0;

        Map<Integer, Integer> cntMap = new HashMap<Integer, Integer>();

        for (int num : nums) {
            cntMap.put(num, cntMap.getOrDefault(num,0) + 1);
        }

        int maxValue = Collections.max(cntMap.values());
        for (int key : cntMap.keySet()) {
            if (cntMap.get(key) == maxValue) {
                answer = key;
            }
        }

        return answer;

    }
}
