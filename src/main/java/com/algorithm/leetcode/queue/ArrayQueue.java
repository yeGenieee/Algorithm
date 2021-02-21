package com.algorithm.leetcode.queue;

public class ArrayQueue {
    int front;
    int rear;
    int size;
    int capacity;
    int[] array;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        front = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    boolean isFull(ArrayQueue queue) {
        return (queue.size == queue.capacity);
    }

    boolean isEmpty(ArrayQueue queue) {
        return (queue.size == 0);
    }

    void enqueue(int item) {
        if (isFull(this)) {
            return;
        }
        this.rear = (this.rear + 1) % capacity;
        this.array[rear] = item;
        this.size = this.size + 1;
        System.out.println(item + " enqueued to queue");
    }

    int dequeue() {
        if (isEmpty(this)) {
            return Integer.MIN_VALUE;
        }
        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    int front() {
        if (isEmpty(this)) {
            return Integer.MIN_VALUE;
        }
        return this.array[this.front];
    }

//    int rear() {
//
//    }
}
