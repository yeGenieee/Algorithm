package com.algorithm.boj.math;

import java.util.Scanner;
import java.io.*;

public class Q17425 {
    static final int MAX = 1000000;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long[] d = new long[MAX+1];
        for (int i=1; i<=MAX; i++) {
            d[i] = 1;
        }
        for (int i=2; i<=MAX; i++) {
            for (int j=1; i*j<=MAX; j++) {
                d[i*j] += i;
            }
        }
        long[] s = new long[MAX+1];
        for (int i=1; i<=MAX; i++) {
            s[i] = s[i-1] + d[i];
        }
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            bw.write(s[n]+"\n");
        }
        bw.flush();
    }


    /**
     * 시간 복잡도 : O(n^2)
     */
    public static void timeoutSolution() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int sum = 0;
            for (int i=1; i<=n; i++) {
                sum += (n/i) * i;
            }
            System.out.println(sum);
        }
    }
}
