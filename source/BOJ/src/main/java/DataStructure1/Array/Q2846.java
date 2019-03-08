package DataStructure1.Array;

import java.util.Scanner;

public class Q2846 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int height = stdIn.nextInt();
        int []input = new int[height];

        for(int i=0;i<input.length;i++) {
            input[i] = stdIn.nextInt();
        }

        System.out.println(MaxUphill(input));
    }

    public static int MaxUphill(int [] arr) {
        int maxuphill_len=0;
        int currentuphill_len=0;

        for(int i=0;i<arr.length-1;i++) {
            if (arr[i] < arr[i+1]) { // 일단 오르막
                currentuphill_len = currentuphill_len + arr[i+1] - arr[i];
                if (currentuphill_len > maxuphill_len) {
                    maxuphill_len = currentuphill_len;
                }
            } else { // 내리막
                currentuphill_len = 0;
            }
        }

        return maxuphill_len;
    }

}
