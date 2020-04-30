package com.algorithm.boj.datastructure1.queue;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Q1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<Integer>();

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for (int i=1;i<=n;i++) {
            queue.add(i);
        }

        for (int i=0;i<n-1;i++) {
            for (int j=0;j<k-1;j++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll() + ", ");
        }

        sb.append(queue.poll() + ">");

        System.out.println(sb);
    }
}
