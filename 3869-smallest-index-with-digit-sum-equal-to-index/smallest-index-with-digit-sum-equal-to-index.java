class Solution {
    public int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;
            int nn = nums[i];

            while (nn > 0) {
                sum += nn % 10;
                nn = nn / 10;
            }

            if (sum == i) {
                return i;
            }
        }

        return -1;
    }
}
