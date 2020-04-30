package IO;

import java.util.Scanner;

public class Q1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        String[] date = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        for (int i=0; i<x-1; i++) {
            y += days[i];
        }

        System.out.println(date[y % 7]);
    }
}
