package com.algorithm.leetcode.array;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums ){
            if (countDigit(num) % 2 == 0) {
                count++;
            }
        }

        return count;

    }

    public int countDigit(int num) {
        int digit = 0;

        while (num != 0) {
            digit++;
            num /= 10;
        }
        return digit;
    }
}
