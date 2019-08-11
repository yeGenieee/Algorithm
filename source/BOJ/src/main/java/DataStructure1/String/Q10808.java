package DataStructure1.String;

import java.util.Scanner;

public class Q10808 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int[] count = new int[26];

        for (int i=0;i<input.length();i++) {
            count[input.charAt(i) - 97]++;
        }

        for (int cnt : count) {
            System.out.print(cnt+" ");
        }
    }
}

