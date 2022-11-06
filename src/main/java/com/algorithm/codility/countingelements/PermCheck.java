import java.util.*;

/**
 * 배열을 정렬한 뒤에, 숫자가 순차적으로 저장되어 있는지 확인
 * 시간복잡도 : O(N)
 */
public class PermCheck {
    public int permCheck(int[] A) {
        Arrays.sort(A);
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return 0;
            }
        }
        
        return 1;
    }
}