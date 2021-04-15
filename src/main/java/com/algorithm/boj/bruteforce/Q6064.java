package com.algorithm.boj.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q6064 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            String[] input = br.readLine().split(" ");
            int M = Integer.parseInt(input[0]);
            int N = Integer.parseInt(input[1]);
            int x = Integer.parseInt(input[2]) - 1;
            int y = Integer.parseInt(input[3]) - 1;

            boolean isValid = false;

            for (int k=x; k<(M*N); k+=M) {
                if (k%N == y) {
                    isValid = true;
                    System.out.println(k+1);
                    break;
                }
            }

            if (!isValid) {
                System.out.println(-1);
            }

        }
    }
}
