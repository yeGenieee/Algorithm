package com.algorithm.boj.bruteforce;

import java.util.Scanner;

public class Q14500_2 {
    static int[][][] block = {
            {{0,1}, {0,2}, {0,3}},
            {{1,0}, {2,0}, {3,0}},
            {{1,0}, {1,1}, {1,2}},
            {{0,1}, {1,0}, {2,0}},
            {{0,1}, {0,2}, {1,2}},
            {{1,0}, {2,0}, {2,-1}},
            {{0,1}, {0,2}, {-1,2}},
            {{1,0}, {2,0}, {2,1}},
            {{0,1}, {0,2}, {1,0}},
            {{0,1}, {1,1}, {2,1}},
            {{0,1}, {1,0}, {1,1}},
            {{0,1}, {-1,1}, {-1,2}},
            {{1,0}, {1,1}, {2,1}},
            {{0,1}, {1,1}, {1,2}},
            {{1,0}, {1,-1}, {2,-1}},
            {{0,1}, {0,2}, {-1,1}},
            {{0,1}, {0,2}, {1,1}},
            {{1,0}, {2,0}, {1,1}},
            {{1,0}, {2,0}, {1,-1}},
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int [][] a = new int[n][m];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int answer = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                for (int k=0; k<19; k++) {
                    boolean ok = true;
                    int sum = a[i][j];

                    for (int l=0; l<3; l++) {
                        int x = i + block[k][l][0];
                        int y = j + block[k][l][1];

                        if (0 <= x && x < n && 0 <= y && y < m) {
                            sum += a[x][y];
                        } else {
                            ok = false;
                            break;
                        }
                    }

                    if (ok && answer < sum) {
                        answer = sum;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
