package com.algorithm.programmers.hash;

import java.util.HashMap;

public class Solution3 {
    public static void main(String[] args) {
        String[][] input1 = {
                            {"yellow_hat","headgear"},
                            {"blue_sunglasses", "eyewear"},
                            {"green_turban", "headgear"}
                            };
        String[][] input2 = {
                {"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        System.out.println(solution(input1));
        System.out.println(solution(input2));

    }

    public static int solution(String[][] clothes) {
        int answer = 0;

        HashMap<String,Integer> hm = new HashMap<>();

        for (int i=0;i<clothes.length;i++) {
            String key = clothes[i][1];

            if (!hm.containsKey(key)) {
                hm.put(clothes[i][1],1);
            } else {
                hm.replace(clothes[i][1],hm.get(clothes[i][1])+1);
            }
        }

       answer = 1;

        for (int value: hm.values()) {
            answer *=(value+1);
        }

        answer--;

        return answer;
    }
}
