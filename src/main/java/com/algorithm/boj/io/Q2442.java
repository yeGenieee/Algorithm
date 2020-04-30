package IO;

import java.util.Scanner;

public class Q2442 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0;i<n;i++) {
            for (int j=i;j<n-1;j++) {
                System.out.print(" ");
            }
            for (int k=0;k<2*i+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
