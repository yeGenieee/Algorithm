/**
 * 배열 각 원소의 합을 구한 다음, 합 배열에서 가장 작은 최소값과 더했을 때 1이되는 x의 값을 찾으면 된다
 * min + x = 1
 * x = 1 - min
 * 시간 복잡도 : O(N)
 */
public class MinimumValueToGetPositiveStepByStepSum {
    public int minStartValue(int[] nums) {
        int minimumValue = 0;
        int total = 0;

        for (int num : nums) {
            total += num;
            minimumValue = Math.min(total, minimumValue);
        }

        return 1 - minimumValue;
    }
}