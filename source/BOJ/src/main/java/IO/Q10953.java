package IO;

import java.util.Scanner;

public class Q10953 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=0;i<num;i++) {
            String line = sc.next();
            String[] arr = line.split(",");

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            System.out.println(a+b);
        }
    }
}
