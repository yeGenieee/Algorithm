package com.algorithm.boj.datastructure1.array;

import java.util.Scanner;

public class Q2920 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int []arr = new int[8];
        String result = "mixed";

        for (int i=0;i<8;i++) {
           arr[i] = stdIn.nextInt();
        }

        System.out.println(Check(arr));
    }

    public static String Check(int[] arr) {
        String result = "";
        for (int i=0;i<7;i++) {
            if (arr[i] - arr[i+1] == -1) {
                result = "ascending";
            }
            else if (arr[i] - arr[i+1] == 1) {
                result = "descending";
            } else {
                result = "mixed";
                return result;
            }
        }

        return result;
    }
}
