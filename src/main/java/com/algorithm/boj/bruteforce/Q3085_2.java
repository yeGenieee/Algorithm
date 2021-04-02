package com.algorithm.boj.bruteforce;

import java.util.Scanner;

/**
 * 시간 복잡도 : O(N^3)
 */
public class Q3085_2 {
    public static int check(char[][] board, int startRow, int endRow, int startCol, int endCol) {
        int len = board.length;
        int answer = 1;

        for (int i=startRow; i<=endRow; i++) {
            int cnt = 1;
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
        }

        for (int i=startCol; i<=endCol; i++) {
            int cnt = 1;
            for (int j=1;j<len; j++) {
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
                if (j+1 < N) {
                    char temp = board[i][j];
                    board[i][j] = board[i][j+1];
                    board[i][j+1] = temp;

                    int current = check(board, i, i, j, j+1);

                    if (current > max) {
                        max = current;
                    }

                    temp = board[i][j];
                    board[i][j] = board[i][j+1];
                    board[i][j+1] = temp;
                }

                if (i+1 < N) {
                    char temp = board[i][j];
                    board[i][j] = board[i+1][j];
                    board[i+1][j] = temp;

                    int current = check(board, i, i+1, j, j);

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
