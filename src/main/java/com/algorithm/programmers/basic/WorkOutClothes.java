package com.algorithm.programmers.basic;

public class WorkOutClothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = 0;
        }

        for (int i : lost) {
            arr[i-1]--;
        }

        for (int i : reserve) {
            arr[i-1]++;
        }

        for (int i=0; i<arr.length; i++) {
            if (arr[i] < 0) {
                if (i != 0 && arr[i-1] > 0) {
                    arr[i]++;
                    arr[i-1]--;
                } else if (i != arr.length-1 && arr[i+1] > 0) {
                    arr[i]++;
                    arr[i+1]--;
                }
            }
        }

        for (int i=0; i<arr.length; i++) {
            if (arr[i] > -1) {
                answer = answer + 1;
            }
        }

        return answer;
    }
}
