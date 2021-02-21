package com.algorithm.leetcode.queue;

import java.util.*;

public class BuiltInQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("The first element is " + queue.peek());

        queue.offer(5);
        queue.offer(13);
        queue.offer(8);
        queue.offer(6);

        queue.poll();

        System.out.println("The first element is " + queue.peek());
        System.out.println("The size of queue is " + queue.size());
    }
}
