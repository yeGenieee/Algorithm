package com.algorithm.leetcode.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack {
    // store elements
    List<Integer> data;

    public Stack() {
        data = new ArrayList<>();
    }

    /**
     * Insert an element into the stack
     * @param x
     */
    public void push(int x) {
        data.add(x);
    }

    /**
     * Checks whether the stack is empty or not
     * @return
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Get the top item from the stack
     * @return
     */
    public int top() {
        return data.get(data.size() - 1);
    }

    /**
     * Delete an element from the stack.
     * Return deleted element
     * @return
     */
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int top = data.get(data.size() - 1);
        data.remove(data.size() - 1);

        return top;
    }
}
