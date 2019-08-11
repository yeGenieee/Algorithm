package IO;

import java.util.Scanner;
import java.lang.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Q11719 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }

        /**
         * BufferedReader를 이용한 풀이
         * */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while((input = in.readLine()) != null) {
            System.out.println(input);
        }
    }
}


