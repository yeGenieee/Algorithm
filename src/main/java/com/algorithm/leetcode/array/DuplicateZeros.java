package com.algorithm.leetcode.array;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        
    }

    public void duplicateZerosDeprecatedSol(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 0) {
                for (int j=arr.length-2; j >= i; j--) {
                    arr[j+1] = arr[j];
                }
                i++;
            }
        }
    }
}
