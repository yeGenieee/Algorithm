package DataStructure1.String;

import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int[] count = new int[26];

        for (int i=0;i<count.length;i++) {
            count[i] = -1;
        }

        for (int i=0;i<input.length();i++) {
            if (count[input.charAt(i)-97] == -1) {
                count[input.charAt(i)-97] = i;
            }
        }

        for (int pos : count) {
            System.out.print(pos+" ");
        }
    }
}
