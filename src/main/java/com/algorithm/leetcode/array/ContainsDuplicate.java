import java.util.*;

public class ContainsDuplicate {


    /**
     * 배열을 정렬해서 바로 옆 인덱스의 item이 같으면 true, 끝까지 다르면 false
     * 시간복잡도 : O(NlogN) (heap 정렬의 시간 복잡도)
     * 공간복잡도 : O(1)
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }

    /**
     * Hashtable을 이요해서 set에 넣고, 이미 Set에 있으면 true, 끝까지 없으면 false
     * @param nums
     * @return
     */
    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);

        for (int current : nums) {
            if (set.contains(current)) {
                return true;
            }
            set.add(current);
        }

        return false;
    }
}