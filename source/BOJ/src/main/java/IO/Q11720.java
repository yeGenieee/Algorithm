package IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

public class Q11720 {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(bf.readLine()); // 숫자의 개수 N
            String input = bf.readLine();// 입력받을 숫자 N개
            int sum = 0;
            for (int i = 0; i < input.length(); i++) {
                sum += Integer.parseInt(input.substring(i, i + 1));
            }
            System.out.println(sum);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
