package com.algorithm.boj.io;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 2438
//        for (int i=1;i<=n;i++) {
//            for (int j=0;j<i;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // 2439
//        for (int i=1; i<=n; i++) {
//            for (int k=n-i; k>0; k--) {
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // 2440
//        for (int i=1; i<=n; i++) {
//            for (int j=n; j>i-1; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 2441
//        for (int i=1; i<=n; i++) {
//            for (int k=0; k<i-1; k++) {
//                System.out.print(" ");
//            }
//            for (int j=n; j>i-1; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 2442
//        for (int i=1; i<=n; i++) {
//            for (int k=n-i; k>0; k--) {
//                System.out.print(" ");
//            }
//            for (int j=0; j < 2*i-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // 2443
//        for (int i=1; i<=n; i++) {
//            for (int k=0; k<i-1; k++) {
//                System.out.print(" ");
//            }
//            for (int j=2*(n-i)+1; j>0; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 2444
//        for (int i=1; i<=n; i++) {
//            for (int k=n; k>i; k--) {
//                System.out.print(" ");
//            }
//            for (int j=1; j<=2*i-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i=1;i<=n-1; i++) {
//            for (int k=1; k<=i; k++) {
//                System.out.print(" ");
//            }
//            for (int j=2*(n-i)-1; j>=1; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 2445
        for (int i=1; i<=n; i++) {
            for (int j=0; j < i; j++) {
                System.out.print("*");
            }
            for (int k=2*(n-i); k>0; k--) {
                System.out.print(" ");
            }
            for (int h=0; h < i; h++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n-1; i>=1; i--) {
            for (int j=i; j>0; j--) {
                System.out.print("*");
            }
            for (int k=1; k <= 2*(n-i); k++) {
                System.out.print(" ");
            }
            for (int h=i; h>0; h--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
