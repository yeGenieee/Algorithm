package com.algorithm.boj.datastructure1.queue;

import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Q1966 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int testcase = stdIn.nextInt();
        stdIn.nextLine();

        for (int i=0;i<testcase;i++) {
            Queue<Integer> queue = new LinkedList<Integer>();
            int N = stdIn.nextInt();
            int M = stdIn.nextInt();

            stdIn.nextLine();

            for (int j=0;j<N;j++) {
                int importance = stdIn.nextInt();
                queue.add(importance);
            }
            checkPrintOrder(queue, N, M);
        }
    }

    /**
     * 중요도 받는 함수
     * */
    public static void putImportance(Queue<Integer> input) {

        for (int i : input) {
            System.out.print(i);
        }
    }

    /**
     * 중요도 체크하는 함수
     * */
    public static int checkPrintOrder(Queue<Integer> input, int N ,int M) {
        int max = Collections.max(input);
        int index = M;

        for (int i=0;i<N;i++) {
//            if (Collections.max(input) > input)

        }

        return 1;
    }
}
