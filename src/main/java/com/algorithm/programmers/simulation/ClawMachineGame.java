package com.algorithm.programmers.simulation;

import java.util.Stack;

public class ClawMachineGame {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<Integer>(); // 바구니
        int answer = 0; // 터지는 인형의 갯수

        for (int position : moves) {
            for (int j=0; j<board.length; j++) {
                int toy = board[j][position-1]; // 인형

                if (toy == 0) {
                    continue;
                }

                // 인형이 뽑힌 경우
                if (!stack.isEmpty() && stack.peek() == toy) {
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(toy);
                }
                board[j][position - 1] = 0;
                break;
            }
        }

        return answer;
    }
}
