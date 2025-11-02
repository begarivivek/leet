import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int s = nums[0];
        int l = nums[nums.length - 1];

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        List<Integer> ans = new ArrayList<>();
        for (int i = s + 1; i < l; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}
