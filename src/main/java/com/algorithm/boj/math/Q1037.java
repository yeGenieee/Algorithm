package com.algorithm.boj.math;

import java.util.Scanner;

/**
 * N = AB로 나타낼 수 있다면, A와 B는 모두 N의 약수가 된다
 * 1과 N을 제외한 모든 약수가 입력으로 주어지므로, 입력으로 받은 진짜 약수 중 min * max를 하면 N이 나온다
 * 시간 복잡도 : O(M) (진짜 약수가 M개 주어진다고 했을 때!)
 */
public class Q1037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i=1; i<n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(min * max);
    }
}
