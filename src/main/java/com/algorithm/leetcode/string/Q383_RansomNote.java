package com.algorithm.leetcode.string;

public class Q383_RansomNote {
    /**
     * ransomNote 길이 만큼 반복문 돌면서 -> 각 인덱스에 해당하는 글자가 magazine에 있는지 확인
     * 없으면 못만드는 거니까 바로 false 리턴
     *  아래 두 줄 반복
         * 있으면 일단 result = true로 두고,
         * 비교해야하는 magazine에서 찾은 글자 없애기
     * TimeComplexity : O(n)
     * SpaceComplexity : O(1)
     * */
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean result = false;
        StringBuilder sb = new StringBuilder(magazine);

        if (ransomNote.equals("")) {
            return true;
        }

        for (char ch : ransomNote.toCharArray()) {
            int idx = sb.indexOf(Character.toString(ch));
            if (idx == -1) {
                return false;
            } else {
                result = true;
                sb.deleteCharAt(idx);
            }
        }

        return result;
    }
}
