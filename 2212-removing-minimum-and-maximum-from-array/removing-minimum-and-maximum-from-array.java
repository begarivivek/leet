class Solution {
    public int minimumDeletions(int[] nums) {
        if (nums.length == 1) return 1;

        int ans = Integer.MAX_VALUE;
        int minindx = 0;
        int maxindx = 0;
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxindx = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                minindx = i;
            }
        }
        int left = Math.min(minindx, maxindx);
        int right = Math.max(minindx, maxindx);
        int n = nums.length;
        ans = Math.min(ans, right + 1);
        ans = Math.min(ans, n - left);
        ans = Math.min(ans, (left + 1) + (n - right));
        return ans;
    }
}
