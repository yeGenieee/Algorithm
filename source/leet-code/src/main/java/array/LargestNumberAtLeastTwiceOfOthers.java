package array;

public class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int max_index=0;
        int dominant_index=-1;

        if (nums.length == 1) {
            dominant_index = 0;
            return dominant_index;
        }

        for (int i=0;i<nums.length;i++) { // 일단 max 값 찾기
            if (nums[i] > max) {
                max = nums[i];
                max_index = i;
            }
        }

        for (int i=0;i<nums.length;i++) {
            if (i == max_index) { // 비교할 필요가 없음
                continue;
            }
            else {
                if (max < 2 * nums[i]) { // max가 원소 i에 2를 곱한 것 보다 작음 (dominant_index는 바로 -1)
                    return -1;
                }
            }
        }
        dominant_index = max_index;

        return dominant_index;
    }
}
