import java.util.*;

class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int revnum = 0;

            while (num > 0) {
                int ld = num % 10;
                revnum = revnum * 10 + ld;
                num /= 10;
            }

            if (map.containsKey(nums[i])) {
                ans = Math.min(ans, i - map.get(nums[i]));
            }

            map.put(revnum, i);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}