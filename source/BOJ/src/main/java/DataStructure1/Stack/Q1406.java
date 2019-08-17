package DataStructure1.Stack;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.lang.StringBuilder;
import java.io.BufferedReader;

public class Q1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        Stack <Character> left = new Stack<Character>();
        Stack <Character> right = new Stack<Character>();

        for (int i=0;i<str.length();i++) {
            left.push(str.charAt(i));
        }

        int num = Integer.parseInt(br.readLine());

        while(num-- > 0) {
            String[] line = br.readLine().split(" ");
            char cmd = line[0].charAt(0);

            if (cmd == 'L') {
                if (!left.empty()) {
                    right.push(left.pop());
                }
            } else if (cmd == 'D') {
                if (!right.empty()) {
                    left.push(right.pop());
                }
            } else if (cmd == 'B') {
                if (!left.empty()) {
                    left.pop();
                }
            } else if (cmd == 'P') {
                char letter = line[1].charAt(0);
                left.push(letter);
            }
        }

        while(!left.empty()) {
            right.push(left.pop());
        }

        StringBuilder sb = new StringBuilder();
        while(!right.empty()) {
            sb.append(right.pop());
        }

        System.out.println(sb);


//        return sb.toString();
    }

}
