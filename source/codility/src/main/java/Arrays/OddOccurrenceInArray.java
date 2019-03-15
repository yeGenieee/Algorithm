package Arrays;

import java.util.HashMap;

public class OddOccurrenceInArray {
    public int solution(int[] A) {
        HashMap<Integer,Integer> pairedMap = new HashMap<Integer,Integer>();

        for (int i=0;i<A.length;i++) {
            int num = A[i];
            Integer cnt = pairedMap.get(num);
            if (cnt == null) {
                pairedMap.put(num, 1);
            } else {
                pairedMap.put(num, cnt+1);
            }
        }


        for (Integer key : pairedMap.keySet()) {
            if (pairedMap.get(key) % 2 != 0) {
                return key;
            }
        }

        return -1;
    }
}

