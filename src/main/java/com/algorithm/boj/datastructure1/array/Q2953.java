package com.algorithm.boj.datastructure1.array;

import java.util.Scanner;

public class Q2953 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int [][]input = new int[5][4];

        for (int i=0;i<input.length;i++) {
            for (int j=0;j<input[i].length;j++) {
                input[i][j] = stdIn.nextInt();
            }
        }

        ContestResult(input);
    }

    public static void ContestResult(int [][] arr) {
        int winner=0, max=0;

        for (int i=0;i<arr.length;i++) {
            int sum = 0;
            for (int j=0;j<arr[i].length;j++) {
                sum += arr[i][j];
            }

            if (sum > max) {
                max = sum;
                winner = (i+1);
            }
        }

        System.out.println(winner+" "+max);
    }
}
