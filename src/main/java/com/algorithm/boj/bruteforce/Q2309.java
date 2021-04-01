package com.algorithm.boj.bruteforce;

import java.util.Scanner;
import java.util.Arrays;

/**
 * 아홉 난쟁이 중 일곱명을 고르는 것은 아홉명 중 두 명을 고르는 것과 같음
 * 난쟁이의 수를 N이라고 했을 때, 두 명을 고르는 경우는 N^2 이고,
 * 나머지 난쟁이의 키의 합을 고르는 시간은 O(N)
 * 이 문제는 O(N^3) 으로 해결할 수 있다
 * 그러나, O(N^2)으로 해결 가능한데,
 * 난쟁이의 키가 시시각각으로 변하는 것이 아니기에 먼저 난쟁이들의 키의 합을 구해두고, 두 명을 제외한 키를 구하면 됨
 * 이 키를 구하는 계산은 sum - i -j => O(1) 임
 * 따라서, 시간 복잡도는 O(N^2)
 */
public class Q2309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 9;
        int [] dwarfs = new int[n];
        int sum = 0;

        // 아홉 난쟁이의 키를 입력받고 전체 키의 합을 구해놓음
        for (int i=0; i<n; i++) {
            dwarfs[i] = scanner.nextInt();
            sum += dwarfs[i];
        }

        // 난쟁이의 키 오름차순 출력을 위해 정렬
        Arrays.sort(dwarfs);

        // 아홉 난쟁이 중 두 명 뽑기
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                // 일곱 난쟁이의 키 합이 100이 되면, (나머지 두 명을 찾은 경우)
                if (sum - dwarfs[i] - dwarfs[j] == 100) {
                    for (int k=0; k<n; k++) {
                        // 진짜 일곱 난쟁이가 아닌 사람 제외 후 출력
                        if (i == k || j == k) {
                            continue;
                        }
                        System.out.println(dwarfs[k]);
                    }
                    System.exit(0);
                }
            }
        }

    }
}
