package IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.*;
import java.util.StringTokenizer;

public class Q10818 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int max,min;
        int n = sc.nextInt();

        int []arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        max = arr[0];
        min = arr[0];
        for (int i=0;i<n;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min+ " " + max);

        /**
         * BufferedReader를 이용한 풀이
         * */

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine(), " "); // 두번째 줄 숫자들 공백으로 분리하여 받아옴

        int maximum = Integer.MAX_VALUE;
        int minimum = Integer.MIN_VALUE;

        while(st.hasMoreTokens()) {
            int currentValue = Integer.parseInt(st.nextToken());

            maximum = Math.max(maximum, currentValue);
            minimum = Math.min(minimum, currentValue);
        }

        System.out.println(minimum+" "+maximum);

    }
}
