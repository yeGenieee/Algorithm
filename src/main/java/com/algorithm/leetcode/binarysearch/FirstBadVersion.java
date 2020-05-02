package com.algorithm.leetcode.binarysearch;

public class FirstBadVersion {
    /**
     * for 문을 이용한 solution --> Time Limit Exceeded
     * Time Complexity : O(log n)
     * Space Somplexity : O(1)
     */
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while(left < right) { // 이진 탐색 종료 조건 : left 가 right를 넘어서는 경우 -> 그 때의 left가 firstBadVersion
            int mid = left + (right - left) / 2; // overflow 방지
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
