package DataStructure1.Stack;

import java.util.Stack;
import java.util.Scanner;

public class Q9012 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int T = stdIn.nextInt();
        stdIn.nextLine();

        while(T-- > 0) {
            System.out.println(isValidPS(stdIn.nextLine()));
        }
    }

    public static String isValidPS(String ps) {
        String result="NO";

        Stack<String> stack = new Stack<String>();

        for(int i=0;i<ps.length();i++) {
            if (ps.charAt(i) == '(') {
                stack.push(Character.toString(ps.charAt(i)));
            } else {
                if (!stack.isEmpty()) {
                    if (stack.pop().equals("(")) {
                        result = "YES";
                    } else {
                        return "NO";
                    }
                } else {
                    return "NO";
                }
            }
        }
        if (!stack.isEmpty()) {
            return "NO";
        }

        return result;
    }
}
