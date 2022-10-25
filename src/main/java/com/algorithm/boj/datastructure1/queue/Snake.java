package com.algorithm.boj.datastructure1.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Snake {

    static int n; // 보드의 크기 (2~100)
    static int k; // 사과의 갯수 (0~100)
    static int l; // 뱀의 방향 변환 횟수 (1~100)
    static int time; // 게임 시간
    static int[][] board;

    static List<int[]> snake; //뱀의 몸통 위치 (x,y)

    // 처음 시작은 오른쪽 방향을 보고 있음
    // 0:오른쪽   1:아래쪽   2:왼쪽   3:위
    // D(오른쪽)가 나오면 index++
    // L(왼쪽)이 나오면 index--
    static int index = 0;
    static int[] dx = {0, 1, 0, -1}; //세로
    static int[] dy = {1, 0, -1, 0}; //가로

    static Map<Integer, String> direction; // 뱀의 방향 정보

    public static void main(String[] args) throws Exception, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        // 1,1이 맨 위 맨 좌측
        board = new int[n+1][n+1];

        // 사과 위치 입력
        String str;
        int row; // 행
        int col; // 열
        for(int i=0; i<k; i++) {
            str = br.readLine();

            row = Integer.parseInt(str.split(" ")[0]);
            col = Integer.parseInt(str.split(" ")[1]);

            board[row][col] = 1;
        }

        // 뱀 방향 정보 입력
        direction = new HashMap<>();
        l = Integer.parseInt(br.readLine());
        for(int i=0; i<l; i++) {
            str = br.readLine();
            int x = Integer.parseInt(str.split(" ")[0]);
            String directionInfo = str.split(" ")[1];

            direction.put(x, directionInfo); // 뱀의 방향 정보를 넣어서, (key에는 시간, value에는 방향값을 넣어줌 - 추후에 key값이 있는지 쉽게 찾을 수 있게 하려고 hashmap이용)
        }

        // 뱀 시작 지점 (1,1) (x,y)
        snake = new LinkedList<>();
        snake.add(new int[]{1,1});

        time = 0;
        int nextX, nextY; // 다음 움직임
        int currentX, currentY; // 현재 움직임(1,1)
        currentX = 1;
        currentY = 1;

        // 뱀 움직임 시작
//        시간에 따라 반복문을 돌게 함 (while은 1초동안 이뤄지는 일들이라고 생각하면 됨)

        while(true) {
            time++; // 시간 1초 추가, index 값을 이용하여 뱀의 머리가 지냉할 방향을 설정해줌 (초기값은 index=0 , 오른쪽 방향 dx[0] dy[0])

            // 다음 움직임(머리 데이터) (현재 위치에 머리가 진행할 방향으로 이동해줌)
            nextX = currentX + dx[index];
            nextY = currentY + dy[index];

            // 다음 움직임에 따라 끝나는지 확인
            if (isFinish(nextX,nextY)) {
                break;
            }

            // 사과 있는지 확인
            // 사과 있으면 사과 없어지고 머리 늘려서 꼬리 그대로 (머리만 늘어난다)
            if (board[nextX][nextY] == 1) {
                board[nextX][nextY] = 0;
                snake.add(new int[] {nextX,nextY}); // 머리 정보 추가
            }
            // 사과 없으면 머리 늘려서 꼬리가 위치한 칸 비워줌
            else {
                snake.add(new int[] {nextX,nextY}); // 머리 정보 추가
                snake.remove(0); // 꼬리 index는 0
            }

            // 현재 움직임에 다음 움직임 저장
            currentX = nextX;
            currentY = nextY;

            // 뱀의 방향 이동 정보가 있는지 확인하고 있으면 해당 시간 끝났을 때 다음 방향 정해주는 부분
            if(direction.containsKey(time)) { // 해당 시간이 방향 변환 정보가 있는지
                // D(오른쪽)가 나오면 index++
                if(direction.get(time).equals("D")) {
                    index++;
                    if(index == 4)
                        index = 0;
                }
                // L(왼쪽)이 나오면 index--
                if(direction.get(time).equals("L")) {
                    index--;
                    if(index == -1)
                        index = 3;
                }

            }
        }

        System.out.println(time);
    }

    // 게임이 끝나는지 확인
    static boolean isFinish(int nextX, int nextY){

        // 벽에 부딪히는 경우 (범위 넘어가는 경우)
        if(nextX < 1 || nextY < 1 || nextX >= n+1 || nextY >= n+1) {
            return true;
        }

        // 자기 몸통에 닿거나 (snake 몸통 정보를 확인)
        for (int i=0; i<snake.size(); i++) {
            if(nextX == snake.get(i)[0] && nextY == snake.get(i)[1]) {
                return true;
            }
        }

        return false;
    }

}
