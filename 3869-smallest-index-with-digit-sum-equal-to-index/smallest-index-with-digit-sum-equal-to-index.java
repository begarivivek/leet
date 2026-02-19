class Solution {
    public int smallestIndex(int[] nums) {
        int nn = 0, d, sum;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            d = 0;
            nn = nums[i];
            while (nn > 0) {
                d = nn % 10;
                sum += d;
                nn = nn / 10;
            }
            if (sum == i) {
                if (sum < min) {
                    min = Math.min(min, sum);
                }
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }
}