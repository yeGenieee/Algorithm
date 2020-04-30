package IO;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.*;

public class Q11721 {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input = bf.readLine();

            for (int i=0;i<input.length();i++) {
                if (i % 10 == 9) {
                    System.out.print(input.charAt(i) + "\n");
                } else {
                    System.out.print(input.charAt(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
