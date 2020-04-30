package com.algorithm.boj.datastructure1.string;

import java.util.Scanner;

public class Q11655 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String cipher = "";

        for (int i=0;i<input.length();i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'M') ch += 13;
            else if (ch >= 'N' && ch <= 'Z') ch -= 13;
            else if (ch >= 'a' && ch <= 'm') ch += 13;
            else if (ch >= 'n' && ch <= 'z') ch -= 13;

            cipher += ch;
        }

        System.out.println(cipher);

    }
}
