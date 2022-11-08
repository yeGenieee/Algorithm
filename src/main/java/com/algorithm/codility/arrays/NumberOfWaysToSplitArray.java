public class NumberOfWaysToSplitArray {
    public int waysToSplitArray(int[] nums) {
        long[] prefix = new long[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            long left = prefix[i];
            long right = prefix[nums.length - 1] - prefix[i];

            if (left >= right) {
                count++;
            }
        }

        return count;
    }
}