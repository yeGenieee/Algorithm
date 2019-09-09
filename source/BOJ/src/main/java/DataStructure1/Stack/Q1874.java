package DataStructure1.Stack;

import java.util.Stack;
import java.util.Scanner;

public class Q1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        int n = sc.nextInt();
        int m = 0;
        String ans = "";

        while (n-- > 0) {
            int i = sc.nextInt(); // 수열을 만드려는 수
            if (i > m) {
                while(i > m) {
                    stack.push(++m);
                    ans += "+\n";
                }
                stack.pop();
                ans += "-\n";
            } else {
                boolean found = false;
                if (!stack.empty()) {
                    int top = stack.peek();
                    stack.pop();
                    ans += "-\n";
                    if (i == top) {
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println(ans);
    }
}
