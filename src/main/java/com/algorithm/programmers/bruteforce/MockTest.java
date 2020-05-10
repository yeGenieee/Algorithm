package com.algorithm.programmers.bruteforce;

import java.util.ArrayList;

public class MockTest {
    /**
     * 1번 수포자, 2번 수포자, 3번 수포자의 반복되는 답을 배열로 입력 후,
     * answer 배열 반복문을 돌면서 -> answer 와 각 수포자의 답이 같으면 -> 점수 +1
     * 가장 큰 점수를 찾아서 maxScore 변수에 담고, 가장 많은 문제를 맞힌 사람을 찾아 배열로 리턴
     * TimeComplexity : O(n) (answer 크기만큼 반복)
     * */
    public int[] solution(int[] answers) {
        int[] score = new int[3];
        int [] personOne = {1,2,3,4,5};
        int [] personTwo = {2,1,2,3,2,4,2,5};
        int [] personThree = {3,3,1,1,2,2,4,4,5,5};

        for (int i=0; i < answers.length; i++) {
            if (answers[i] == personOne[i % personOne.length]) {
                score[0]++;
            }
            if (answers[i] == personTwo[i % personTwo.length]) {
                score[1]++;
            }
            if (answers[i] == personThree[i % personThree.length]) {
                score[2]++;
            }
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> maxScoreList = new ArrayList<Integer>();
        if (maxScore == score[0]) {
            maxScoreList.add(1);
        }
        if (maxScore == score[1]) {
            maxScoreList.add(2);
        }
        if (maxScore == score[2]) {
            maxScoreList.add(3);
        }

        return maxScoreList.stream().mapToInt(i -> i.intValue()).toArray();
    }
}
