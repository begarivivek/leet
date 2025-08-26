import java.util.*;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= list.size() - k; i++) {
            int diff = list.get(i + k - 1) - list.get(i);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }
}
