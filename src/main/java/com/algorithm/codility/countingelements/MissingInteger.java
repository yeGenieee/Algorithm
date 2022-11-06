/**
 * 배열을 정렬한 뒤에, 현재 배열의 값이 순차적으로 나와야 하는 양의 정수 값과 같은지 비교
 * 같으면 다음에 나와야 하는 양의 정수 값으로 answer 값 1 증가
 * answer 리턴
 * 시간 복잡도 : O(N)
 */
public class MissingInteger {
    public int missingInteger(int[] A) {
        Arrays.sort(A);
        int answer = 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == answer) {
                answer++;
            }
        }

        return answer;
    }
}