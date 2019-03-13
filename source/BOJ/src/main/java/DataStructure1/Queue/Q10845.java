package DataStructure1.Queue;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Q10845 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        stdIn.nextLine();

        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i=0;i<N;i++) {
            String cmdLine = stdIn.nextLine();
            String cmd = cmdLine.split(" ")[0];

            if (cmd.equals("push")) {
                queue.add(Integer.parseInt(cmdLine.split(" ")[1]));
            } else if (cmd.equals("pop")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.poll());
                }
            } else if (cmd.equals("size")) {
                if (queue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(queue.size());
                }
            } else if (cmd.equals("empty")) {
                if (queue.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (cmd.equals("front")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.peek());
                }
            } else if (cmd.equals("back")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(((LinkedList<Integer>) queue).peekLast());
                }

            } else {

            }
        }

    }
}