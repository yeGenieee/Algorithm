package DataStructure1.Stack;

import java.util.Stack;
import java.io.*;

public class Q17413 {
    public static void print(Stack<Character> st, StringBuilder sb) {
        while(!st.empty()) {
            sb.append(st.pop());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        boolean isTag = false;

        for (char ch : str.toCharArray()) {
            if (ch == '<') { // 문자열의 시작인 경우 or 다음 괄호가 나오는 경우 - 이전 문자열을 모두 출력해야 함
                print(stack,sb);
                isTag = true;
                sb.append(ch);
            } else if (ch == '>') {
                isTag = false;
                sb.append(ch);
            } else if (isTag) {
                sb.append(ch);
            } else {
                if (ch == ' ') {
                    print(stack, sb);
                    sb.append(ch);
                } else {
                    stack.push(ch);
                }
            }
        }

        print(stack,sb); // 출력되지 않은 문자열이 있을 수도 있으므로, 스택 비워주어 출력

        System.out.println(sb);

    }
}
