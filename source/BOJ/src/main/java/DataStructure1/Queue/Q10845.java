package DataStructure1.Queue;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Q10845 {
    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        int N = stdIn.nextInt();
//        stdIn.nextLine();
//
//        Queue<Integer> queue = new LinkedList<Integer>();
//
//        for (int i=0;i<N;i++) {
//            String cmdLine = stdIn.nextLine();
//            String cmd = cmdLine.split(" ")[0];
//
//            if (cmd.equals("push")) {
//                queue.add(Integer.parseInt(cmdLine.split(" ")[1]));
//            } else if (cmd.equals("pop")) {
//                if (queue.isEmpty()) {
//                    System.out.println(-1);
//                } else {
//                    System.out.println(queue.poll());
//                }
//            } else if (cmd.equals("size")) {
//                if (queue.isEmpty()) {
//                    System.out.println(0);
//                } else {
//                    System.out.println(queue.size());
//                }
//            } else if (cmd.equals("empty")) {
//                if (queue.isEmpty()) {
//                    System.out.println(1);
//                } else {
//                    System.out.println(0);
//                }
//            } else if (cmd.equals("front")) {
//                if (queue.isEmpty()) {
//                    System.out.println(-1);
//                } else {
//                    System.out.println(queue.peek());
//                }
//            } else if (cmd.equals("back")) {
//                if (queue.isEmpty()) {
//                    System.out.println(-1);
//                } else {
//                    System.out.println(((LinkedList<Integer>) queue).peekLast());
//                }
//
//            } else {
//
//            }
//        }
        /**
         *  배열을 이용한 큐의 구현
         * */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] queue = new int[num];
        int begin = 0;
        int end = 0;

        while (num-- > 0) {
            String cmd = sc.next();
            if (cmd.equals("push")) {
                int x = Integer.parseInt(sc.next());
                queue[end++] = x;
            } else if (cmd.equals("pop")) {
                if (begin == end) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue[begin++]);
                }
            } else if (cmd.equals("size")) {
                System.out.println(end-begin);
            } else if (cmd.equals("empty")) {
                if (begin == end) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (cmd.equals("front")) {
                if (begin == end) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue[begin]);
                }
            } else if (cmd.equals("back")) {
                if (begin == end) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue[end-1]);
                }
            }
        }
    }
}