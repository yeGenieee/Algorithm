/**
 * currentMin 과 currentMax를 두고 갱신
 * currentMin : counter 배열의 모든 요소들이 이 값보다는 커야하는 숫자 (max counter)
 * currentMax : counter 내 현재 최댓값
 * 1. 배열을 순회하면서 currentMin과 currentMax 값을 갱신한다
 * 2. 마지막에 counter 배열을 최소 currentMin 이상의 값을 가지도록 한 번에 갱신한다
 *
 * 1. 배열을 순회하면서
 *      A[k] <= N 이면 현재 counter[A[k] - 1]과 currentMin을 비교해서 더 큰 값으로 갱신
 *          increase(X)에 따라 counter[A[k] - 1]을 1 증가
 *          currentMax를 현재 counter[A[k] - 1]과 비교해서 최대값 갱신
 *      A[k] == N + 1이면 max counter로 counter값을 모두 갱신
 *          currentMin을 currentMax로 갱신
 * 2. counter 배열을 순회하면서 counter[i]와 currentMin 중 최대값으로 갱신한다
 *
 * 시간 복잡도 : O(N)
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