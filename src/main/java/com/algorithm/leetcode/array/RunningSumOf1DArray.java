/**
 * 리턴할 합 배열을 만들고,
 * 기존 nums 배열을 순회하면서
 * sum [i] = sum[i-1] + nums[i]
 * 로 채운다
 * 시간 복잡도 : O(N)
 */
public class RuningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        return sum;
    }
}