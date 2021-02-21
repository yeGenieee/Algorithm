package com.algorithm.leetcode.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    // store elements
    private List<Integer> data;

    // a pointer to indicate the start position
    private int p_start;

    public MyQueue() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }

    /**
     * Insert an element into the queue.
     * Return true if the operation is successful
     * @param x 큐에 추가할 아이템
     * @return 삽입 연산이 완료되면 true 반환
     */
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    /**
     * Delete an element from the queue.
     * Return true if the operation is successful
     * @return
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        p_start++;
        return true;
    }

    /**
     * Get the front item from the queue
     * @return front item
     */
    public int front() {
        return data.get(p_start);
    }

    /**
     * Checks whether the queue is empty or not
     * @return true or false
     */
    public boolean isEmpty() {
        return p_start >= data.size();
    }
}
