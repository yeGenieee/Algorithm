package com.algorithm.programmers.basic;

public class DayOf2016 {
    /**
     * 2016년 1월 1일이 금요일이라고 했으므로 -> day 배열은 목요일부터 시작
     * 각 달의 일 수를 가지는 daysOfMonth int 배열을 두고,
     * input으로 주어지는 a-1 달까지의 일수 + b 일 을 더해 dates 변수에 저장
     * dates 변수를 7로 나누어 그 나머지를 리턴하면 -> 2016년 a월 b일의 요일을 구할 수 있음
     * TimeComplexity : O(n)
     * SpaceComplexity : O(1)
     * */
    public String solution(int a, int b) {
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] daysOfMonth = {31,29,31,30,31,30,31,31,30,31,30,31};
        int dates = 0;

        for (int i=0; i<a-1; i++) {
            dates += daysOfMonth[i];
        }
        dates += b;

        return day[dates % 7];
    }
}
