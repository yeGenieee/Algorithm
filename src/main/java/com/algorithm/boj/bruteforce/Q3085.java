package com.algorithm.boj.bruteforce;

import java.util.Scanner;

/**
 * 배열 내 인접한 두 칸을 골라 서로 swap
 * O(N^4)
 */
public class Q3085 {
    // 연속 사탕의 갯수 구하는 메소드
    public static int check(char[][] board) {
        int len = board.length;
        int answer = 1;

        for (int i=0; i<len; i++) {
            int cnt = 1;
            // 현재 열에 사탕이 연속으로 몇 개 들어있는지 구함
            for (int j=1; j<len; j++) {
                if (board[i][j] == board[i][j-1]) {
                    cnt++;
                } else {
                    cnt = 1;
                }

                if (cnt > answer) {
                    answer = cnt;
                }
            }

            // 현재 행에 사탕이 연속으로 몇 개 들어있는지 구함
            cnt = 1;
            for (int j=1; j<len; j++) {
                if (board[j][i] == board[j-1][i]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                if (cnt > answer) {
                    answer = cnt;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[][] board = new char[N][N];

        for (int i=0; i<N; i++) {
            board[i] = scanner.next().toCharArray();
        }

        int max = 0;

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                // 오른쪽 사탕 swap
                if (j+1 < N) {
                    char temp = board[i][j];
                    board[i][j] = board[i][j+1];
                    board[i][j+1] = temp;

                    int current = check(board);

                    if (current > max) {
                        max = current;
                    }

                    temp = board[i][j];
                    board[i][j] = board[i][j+1];
                    board[i][j+1] = temp;
                }

                // 아래쪽 사탕 swap
                if (i+1 < N) {
                    char temp = board[i][j];
                    board[i][j] = board[i+1][j];
                    board[i+1][j] = temp;

                    int current = check(board);

                    if (current > max) {
                        max = current;
                    }

                    temp = board[i][j];
                    board[i][j] = board[i+1][j];
                    board[i+1][j] = temp;
                }
            }
        }

        System.out.println(max);

    }
}
