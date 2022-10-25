import java.util.*;

public class TwoSum {
    /**
     * 시간복잡도 : O(N^2)
     * 공간복잡도 : O(1)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == target - nums[j]) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    /**
     * 시간복잡도 : O(N)
     * 공간복잡도 : O(N)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++ {
            int current = nums[i];
            // current + x = target
            // x = target - current;
            int x = target - current;

            if (map.containsKey(x)) {
                return new int[] { map.get(x), i};
            }

            map.put(nums[i], i);
        }

        return null;
    }
}