package com.algorithm.programmers.stack;

import java.util.*;

public class Top {
    public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack<Integer> sender = new Stack<>(); // 송신하는 탑을 저장할 스택

        for (int i=0; i<heights.length; i++) {
            sender.push(heights[i]); // 스택에 송신탑 푸시
        }

        // 탑 갯수 만큼 반복
        for (int i=heights.length - 1; i>=0; i--) {
            int senderHeight = sender.pop(); // 현재 송신할 탑의 높이
            Stack<Integer> receiver = (Stack<Integer>) sender.clone(); // 수신탑 스택을 복사

            int cnt = 0; // 수신탑의 pop 반복 횟수 카운트
            while (!receiver.isEmpty()) { // 수신탑이 없을 때 까지 (가장 왼쪽의 탑, 첫 번째 탑까지 검사 완료)
                int receiverHeight = receiver.pop(); // 현재 수신할 탑의 높이
                cnt++; // pop 횟수 증가
                if (receiverHeight > senderHeight) { // 수신탑의 높이가 송신탑보다 높아야 수신 가능
                    answer[i] = sender.size() - cnt + 1; // 수신탑의 인덱스 저장
                    break;
                }
            }
        }
        return answer;
    }
}
