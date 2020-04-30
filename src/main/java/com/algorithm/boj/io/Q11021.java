package IO;

import java.util.Scanner;

public class Q11021 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a,b;
        for (int i=0;i<n;i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println("Case #"+(i+1)+": " + (a+b));
        }

    }
}
