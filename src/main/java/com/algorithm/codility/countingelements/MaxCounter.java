/**
 * currentMin 과 currentMax를 두고 갱신
 * currentMin : counter 배열의 모든 요소들이 이 값보다는 커야하는 숫자 (max counter)
 * currentMax : counter 내 현재 최댓값
 *
 */
public class MaxCounter {
    public int[] maxCounter(int N, int[] A) {
        int[] counter = new int[N];
        int currentMin = 0;
        int currentMax = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                counter[A[i] - 1] = Math.max(currentMin, counter[A[i] - 1]);
                counter[A[i] - 1]++;
                currentMax = Math.max(currentMax, counter[A[i] - 1]);
            } else if (A[i] == N + 1) {
                currentMin = currentMax;
            }
        }

        // counter 배열을 갱신
        for (int i = 0; i < counter.length; i++) {
            counter[i] = Math.max(currentMin, counter[i]);
        }

        return counter;
    }
}