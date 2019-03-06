package DataStructure1.Array;

import java.util.Scanner;

public class Q3052 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int []input = new int[10];
        int []remainderCnt = new int[42];

        for (int i=0;i<10;i++) {
            input[i] = stdIn.nextInt();
            int remainder = input[i] % 42;
            remainderCnt[remainder] += 1;
        }

        System.out.println(CountRemainder(remainderCnt));
    }

    public static int CountRemainder(int[] arr) {
        int result = 0;

        for (int i=0;i<42;i++) {
            if (arr[i] > 0) {
                result++;
            }
        }

        return result;
    }
}
