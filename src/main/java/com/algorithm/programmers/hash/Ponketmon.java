public class Ponketmon {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return Math.min(answer, set.size());
    }
}