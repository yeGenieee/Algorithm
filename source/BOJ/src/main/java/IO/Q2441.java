package IO;

import java.util.Scanner;

public class Q2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0;i<n;i++) {
            for (int j=0;j<i;j++) {
                System.out.print(" ");
            }
            for (int k=i;k<n;k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
