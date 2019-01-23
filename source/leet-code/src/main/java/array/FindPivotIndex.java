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

    /**
     * nums 배열 원소의 전체 합 : sum, 인덱스 i를 기준으로 그 왼쪽 원소들의 합 : leftsum
     * 인덱스 i를 기준으로 그 오른쪽 원소들의 합 : S - leftsum - nums[i]
     * leftsum과 S - leftsum - nums[i] 가 같아지는 인덱스 i가 pivot Index
     *
     * Time Complexity : O(N) nums 배열의 길이만큼 for 문
     * Space Complexity : O(1) leftsum, S 메모리 사용
     * */
    public int pivotIndexOfficialSolution(int[] nums) {
        int sum=0, leftsum=0;

        for(int x:nums) sum += x;
        for(int i=0;i<nums.length;i++) {
            if (leftsum == (sum - leftsum - nums[i])) {
                return i;
            }
            leftsum += nums[i];
        }

        return -1;
    }
}
