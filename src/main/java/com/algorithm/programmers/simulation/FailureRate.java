package com.algorithm.programmers.simulation;

import java.util.*;

public class FailureRate {
    public static int[] solution(int N, int[] stages) {

        Map<Integer, Double> fail = new HashMap<>();
        LinkedHashMap<Integer, Double> result = new LinkedHashMap<>();

        // 실패율 계산
        for (int i=1; i<=N; i++) {
            int reachedCount = getReachedPlayer(i, stages);
            int unclearedCount = getUnclearedPlayer(i, stages);

            double failureRate = (reachedCount == 0) ? 0 : ((double) unclearedCount / (double) reachedCount);

            fail.put(i, failureRate);
        }

        // 실패율 내림차순으로 정렬
        fail.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));

        Integer[] keyArray = result.keySet().toArray(new Integer[N]);

        return Arrays.stream(keyArray).mapToInt(Integer::intValue).toArray();
    }

    /**
     * 스테이지에 도달한 플레이어 수 계산
     * @param currentStage
     * @param stages
     * @return
     */
    public static int getReachedPlayer(int currentStage, int[] stages) {
        int result = 0;
        for (int i=0; i<stages.length; i++) {
            if (stages[i] >= currentStage) {
                result++;
            }
        }
        return result;
    }

    /**
     * 스테이지에 도달했으나 아직 클리어하지 못한 플레이어 수 계산
     * @param currentStage
     * @param stages
     * @return
     */
    public static int getUnclearedPlayer(int currentStage, int[] stages) {
        int result = 0;
        for (int i=0; i<stages.length; i++) {
            if (stages[i] == currentStage) {
                result++;
            }
        }
        return result;
    }
}
