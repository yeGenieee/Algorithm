package com.algorithm.programmers.basic;

import java.util.*;

public class FindKimInSeoul {
    public String solution(String[] seoul) {
        int idx = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + idx +"에 있다";

//        String answer = "";
//
//        for (int i=0;i<seoul.length;i++) {
//            if (seoul[i].equals("Kim")) {
//                answer = "김서방은 " + idx + "에 있다";
//            }
//        }
//
//        return answer;
    }
}
