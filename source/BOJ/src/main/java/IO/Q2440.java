package IO;

import java.util.Scanner;

public class Q2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            for (int j=n; j>i;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
