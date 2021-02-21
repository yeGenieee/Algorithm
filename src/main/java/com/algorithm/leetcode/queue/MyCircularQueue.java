package com.algorithm.leetcode.queue;

public class MyCircularQueue {
    private int[] data;
    private int front ;
    private int rear;
    private int size;

    public MyCircularQueue(int k) {
        data = new int[k];
        front = -1;
        rear = -1;
        size = k;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return data[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return data[rear];
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        data[rear] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
            return true;
        }
        front = (front + 1) % data.length;
        return true;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }
}
