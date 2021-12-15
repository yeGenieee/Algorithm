package com.algorithm.boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q10757 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        BigInteger A = new BigInteger(st.nextToken());
//        BigInteger B = new BigInteger(st.nextToken());
//
//        A.add(B);
//
//        System.out.println(A.toString());
//
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String strA = st.nextToken();
        String strB = st.nextToken();

        int maxLength = Math.max(strA.length(), strB.length());

        int[] A = new int[maxLength + 1];
        int[] B = new int[maxLength + 1];

        for (int i = strA.length() - 1, idx = 0; i >= 0; i--, idx++) {
            A[idx] = strA.charAt(i) - '0';
        }

        for (int i = strB.length() - 1, idx = 0; i >=0; i--, idx++) {
            B[idx] = strB.charAt(i) - '0';
        }

        for (int i = 0; i < maxLength; i++) {
            int sum = A[i] + B[i];
            A[i] = (sum) % 10;
            A[i+1] = A[i+1] + (sum / 10);
        }

        if (A[maxLength] != 0) {
            System.out.print(A[maxLength]);
        }

        for (int i = maxLength - 1; i >= 0; i--) {
            System.out.print(A[i]);
        }
    }
}
