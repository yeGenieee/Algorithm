package com.algorithm.boj.datastructure1.array;

import java.util.Scanner;

public class Q1159 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int num = stdIn.nextInt(); // 선수의 수 N
        stdIn.nextLine();

        String []input = new String[num]; // 선수 명단을 입력 받을 배열
        int []lastname_cnt = new int[26]; // 각 선수의 성의 첫 글자가 나타난 개수를 입력받을 배열


        for (int i=0;i<input.length;i++){
            input[i] = stdIn.nextLine(); // 선수들의 성을 입력 받음
        }


        System.out.println(checkStarter(input, lastname_cnt));
    }

    public static String checkStarter(String[] input, int[] lastname_cnt) {
        String result=""; // 선발 명단

        for (int i=0;i<input.length;i++) {
            int ascii = (int) input[i].charAt(0); // 선수 명단에 있는 선수들 성의 첫 글자
            lastname_cnt[ascii-97]++; // 성의 첫 글자에 해당하는 인덱스 값 증가 (a의 아스키 코드는 97, 배열 인덱스는 0부터 시작)
        }

        for (int i=0;i<lastname_cnt.length;i++) {
            if (lastname_cnt[i] >= 5) { // 선수 5명을 선발 할 수 있는 경우
                result = result + Character.toString((char)(i+97)); // 선발 명단에 선발 가능한 성의 첫 글자 추가
            }
        }

        if (result.equals("")) { // 선수 5명을 선발 할 수 없는 경우 (항복,기권)
            result = "PREDAJA";
        }


        return result;

    }
}
