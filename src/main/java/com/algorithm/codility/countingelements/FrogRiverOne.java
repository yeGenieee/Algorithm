import java.util.*;

/**
 * 1부터 X까지 모두 등장해야 하므로, Set을 이용한다
 * 배열에 등장하는 값을 set에 일단 넣고
 * set.size() 가 X와 같아질 때의 index를 리턴한다 (그게 아니면 -1 리턴)
 * 시간복잡도 : O(N)
 */
public class FrogRiverOne {
    public int frogRiverOne(int X, int[] A) {
        int answer = -1;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            if (set.size() == X) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}