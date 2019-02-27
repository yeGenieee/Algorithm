// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class BinaryGap {
    public int solution(int N) {
        int maxBinaryGap = 0; // 최대 BinaryGap 수 (Output)
        int currentBinaryGap = 0; // 현재 BinaryGap 수

        String binNum = Integer.toBinaryString(N); // 이진수 String으로 변환

        // 변환된 이진수를 반복하며 1과 0이 나오는 것 검사
        for (int i=0;i<binNum.length();i++) {
            if (binNum.charAt(i) == '0') { // 0일때 (currentbinaryGap 수 증가)
                currentBinaryGap++;
            }
            else { // 1일때 currentBinaryGap은 0
                if (currentBinaryGap > maxBinaryGap) { // currentBinaryGap이 maxBinaryGap보다 커지면, 최대값을 갱신해야함
                    maxBinaryGap = currentBinaryGap;
                }
                currentBinaryGap = 0;
            }
        }

        return maxBinaryGap;

    }
}