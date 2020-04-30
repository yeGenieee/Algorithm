package IO;

import java.util.Scanner;

public class Q2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1;i<=n;i++) {
            for (int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            for (int k=0; k<2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n-1;i>=0;i--) {
            for (int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            for (int k=0;k<2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
