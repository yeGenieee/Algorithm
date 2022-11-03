import java.util.*;

public class OddOccurencesInArray {
    public int oddOccurencsInArray(int[] A) {
        Map<Integer, Integer> map  = new HashMap<>();
        int answer = 0;

        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                answer = entry.getKey();
                break;
            }
        }

        return answer;
    }
}