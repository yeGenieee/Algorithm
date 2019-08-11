package DataStructure1.String;

import java.util.Scanner;

public class Q10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        String A = String.valueOf(a);
        String B = String.valueOf(b);
        String C = String.valueOf(c);
        String D = String.valueOf(d);

        A += B;
        C += D;

        long left = Long.valueOf(A);
        long right = Long.valueOf(C);

        System.out.println(left+right);
    }
}
