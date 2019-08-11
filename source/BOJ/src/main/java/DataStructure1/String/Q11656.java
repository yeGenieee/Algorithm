package DataStructure1.String;

import java.util.Scanner;
import java.util.Arrays;

public class Q11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] suffix = new String[input.length()];

        for (int i=0; i<suffix.length;i++) {
            suffix[i] = input.substring(i);
        }

        Arrays.sort(suffix);

        for (int i=0;i<suffix.length;i++) {
            System.out.println(suffix[i]);
        }
    }
}
