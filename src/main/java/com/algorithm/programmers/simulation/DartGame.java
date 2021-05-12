package com.algorithm.programmers.simulation;

import java.util.Arrays;

public class DartGame {
    public int solution(String dartResult) {

        int[] result = new int[3];

        String[] scoresSplit = dartResult.split("[SDT*#]");
        int[] scores = new int[3];

        String[] option = new String[3];
        String[] optionSplit = dartResult.split("\\d");

        int idx = 0;
        for (String score : scoresSplit) {
            if (!score.equals("")) {
                scores[idx++] = Integer.parseInt(score);
            }
        }

        int index = 0;
        for (int i = 0; i < optionSplit.length; i++) {
            if (!optionSplit[i].equals("")) {
                option[index++] = optionSplit[i];
            }
        }

        for (int i = 0; i < option.length; i++) {
            int score = scores[i];
            if (option[i].contains("T")) {
                score = (int) Math.pow(score, 3);
            } else if (option[i].contains("D")) {
                score = (int) Math.pow(score, 2);
            }
            if (option[i].contains("*")) {
                score *= 2;
                if (i != 0) {
                    result[i - 1] *= 2;
                }
            } else if (option[i].contains("#")) {
                score *= -1;
            }
            result[i] = score;
        }
        return Arrays.stream(result).sum();
    }

}
