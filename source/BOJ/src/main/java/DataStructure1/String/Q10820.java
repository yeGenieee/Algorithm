package DataStructure1.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = "";

        while((line = br.readLine()) != null) {
            int[] count = new int[4];

            for (int i=0;i<line.length();i++) {
                if (line.charAt(i) >= 97 && line.charAt(i) <= 122) {
                    count[0]++;
                } else if (line.charAt(i) >=65 && line.charAt(i) <=90) {
                    count[1]++;
                } else if (line.charAt(i) >= 48 && line.charAt(i) <= 57) {
                    count[2]++;
                } else if (line.charAt(i) == 32) {
                    count[3]++;
                }
            }

            for (int cnt : count) {
                System.out.print(cnt+" ");
            }
        }


    }
}
