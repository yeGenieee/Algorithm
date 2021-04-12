package com.algorithm.boj.bruteforce;

import java.util.Scanner;

public class Q14500 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int answer = 0;

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                // 1-1. 기다란 막대 (가로)
                if (j+3 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i][j+2] + a[i][j+3];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 1-2. 기다란 막대 (세로)
                if (i+3 < n) {
                    int temp = a[i][j] + a[i+1][j] + a[i+2][j] + a[i+3][j];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 2. 정사각형
                if (i+1 < n && j+1 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i+1][j] + a[i+1][j+1];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 3-1. 꺾쇠 모양 (기다란 니은)
                if (i+2 < n && j+1 < m) {
                    int temp = a[i][j] + a[i+1][j] + a[i+2][j] + a[i+2][j+1];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 3-2. 꺾쇠 모양 (기다란 니은을 좌우 대칭)
                if (i+2 < n && j-1 >= 0) {
                    int temp = a[i][j] + a[i+1][j] + a[i+2][j] + a[i+2][j-1];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 3-3. 꺾쇠 모양 (기다란 기역)
                if (i+2 < n && j+1 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i+1][j+1] + a[i+2][j+1];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 3-4. 꺾쇠 모양 (기다란 기역을 좌우 대칭)
                if (i+2 < n && j+1 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i+1][j] + a[i+2][j];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 3-5. 꺾쇠 모양 (넓은 기역)
                if (i+1 < n && j+2 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+2];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 3-6. 꺾쇠 모양 (넓은 기역을 좌우 대칭)
                if (i+1 < n && j+2 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 3-7. 꺾쇠 모양 (넓은 니은)
                if (i+1 < n && j+2 < m) {
                    int temp = a[i][j] + a[i+1][j] + a[i+1][j+1] + a[i+1][j+2];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 3-8. 꺾쇠 모양 (넓은 니은을 좌우 대칭)
                if (i-1 >= 0 && j+2 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i][j+2] + a[i-1][j+2];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 4-1. 리을 (세로)
                if (i+2 < n && j+1 < m) {
                    int temp = a[i][j] + a[i+1][j] + a[i+1][j+1] + a[i+2][j+1];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 4-2. 리을 (세로 리을을 좌우 대칭)
                if (i+2 < n && j-1 >= 0) {
                    int temp = a[i][j] + a[i+1][j] + a[i+1][j-1] + a[i+2][j-1];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 4-3. 리을
                if (i+1 < n && j+2 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i+1][j+1] + a[i+1][j+2];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 4-4. 리을 (리을을 좌우 대칭)
                if (i-1 >= 0 && j+2 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i-1][j+1] + a[i-1][j+2];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 5-1. ㅜ
                if (i+1 < n && j+2 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 5-2. ㅗ
                if (i-1 >= 0 && j+2 < m) {
                    int temp = a[i][j] + a[i][j+1] + a[i][j+2] + a[i-1][j+1];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 5-3. ㅏ
                if (i+2 < n && j+1 < m) {
                    int temp = a[i][j] + a[i+1][j] + a[i+2][j] + a[i+1][j+1];
                    if (answer < temp) {
                        answer = temp;
                    }
                }

                // 5-4. ㅓ
                if (i+2 < n && j-1 >= 0) {
                    int temp = a[i][j] + a[i+1][j] + a[i+2][j] + a[i+1][j-1];
                    if (answer < temp) {
                        answer = temp;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}