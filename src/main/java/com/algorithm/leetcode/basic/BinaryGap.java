import java.util.*;

public class BinaryGap {
    public int binaryGap(int n) {
        String binary  = Integer.toBinaryString(n);
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                indices.add(i+1);
            }
        }

        int answer = 0;
        for (int i = 0; i < indices.size() - 1; i++) {
            answer = Math.max(answer, indices.get(i+1) - indices.get(i));
        }

        return answer;
    }
}