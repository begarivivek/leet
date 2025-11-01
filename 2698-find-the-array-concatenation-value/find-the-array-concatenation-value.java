class Solution {
    public long findTheArrayConcVal(int[] nums) {

        long ans = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]).append(nums[j]);
            long val = Long.parseLong(sb.toString());
            ans += val;
            i++;
            j--;
        }
        if (i == j)
            ans += nums[i];
        return ans;

    }
}