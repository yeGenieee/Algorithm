package array;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int ls = 0, rs = 0, pivot = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                ls = ls + nums[j]; // index를 기준으로 왼쪽 sum
            }
            for (int k = i + 1; k < nums.length; k++) {
                rs = rs + nums[k]; // index를 기준으로 오른쪽 sum
            }
            if (ls == rs) {
                pivot = i;
                break;
            }
            ls = 0;
            rs = 0;
        }

        return pivot;
    }
}
