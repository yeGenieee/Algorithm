package com.algorithm.leetcode.array;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public int[] squaresOfSortedArray(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            int num = Math.abs(nums[i]);
            nums[i] = num * num;
        }

        Arrays.sort(nums);

        return nums;
    }
}
