package com.algorithm.boj.datastructure1.queue;

import java.util.*;
import java.io.*;

public class Q3190 {
    static int n;
    static int k;
    static int l;
    static int time;
    static int [][] board;

    static List<int[]> snake;

    static int index = 0;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    static Map<Integer, String> direction;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        board = new int[n+1][n+1];

        for (int i=0; i<k; i++) {
            String input = br.readLine();
            int row = Integer.parseInt(input.split(" ")[0]);
            int col = Integer.parseInt(input.split(" ")[0]);

            board[row][col] = 1;
        }

        direction = new HashMap<>();

        l = Integer.parseInt(br.readLine());
        for (int i=0; i<l; i++) {
            String input = br.readLine();
            int x = Integer.parseInt(input.split(" ")[0]);
            String d = input.split(" ")[1];

            direction.put(x, d);
        }

        snake = new LinkedList<>();
        snake.add(new int[] {1,1});

        time = 0;
        int nextX, nextY;
        int currentX, currentY;
        currentX = 1;
        currentY = 1;

        while (true) {
            time++;

            nextX = currentX + dx[index];
            nextY = currentY + dy[index];

            if (isGameFinished(nextX, nextY)) {
                break;
            }

            if (board[nextX][nextY] == 1) {
                board[nextX][nextY] = 0;
                snake.add(new int[] {nextX, nextY});
            } else {
                snake.add(new int[] {nextX, nextY});
                snake.remove(0);
            }

            currentX = nextX;
            currentY = nextY;

            if (direction.containsKey(time)) {
                if (direction.get(time).equals("D")) {
                    index++;
                    if (index == 4) {
                        index = 0;
                    }
                }
                if (direction.get(time).equals("L")) {
                    index--;
                    if (index == -1) {
                        index = 3;
                    }
                }
            }
        }
        System.out.println(time);
    }

    static boolean isGameFinished(int x, int y) {
        if (x < 1 || y < 1 || x >= n + 1 || y >= n +1) {
            return true;
        }

        for (int i=0; i<snake.size(); i++) {
            if (x == snake.get(i)[0] && y == snake.get(i)[1]) {
                return true;
            }
        }

        return false;
    }
}
