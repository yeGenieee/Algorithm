package com.algorithm.codility.arrays;

public class CyclicRotation {
    class Solution {
        public int[] solution(int[] A, int K) {
            for (int i=0;i<K;i++) { // K번 Rotate
                int tmp = A[A.length-1]; // 배열의 가장 오른쪽 끝 값 임시 저장

                for (int j=A.length-1;j>=1; j--) { // 오른쪽으로 shift
                    A[j] = A[j-1];

                }
                A[0] = tmp;
            }


            return A;
        }
    }
}
