class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long sum=0;
        Arrays.sort(nums);
        while(k>0){
            sum+=Math.abs(nums[0]-nums[nums.length-1]);
            k--;
        }
        return sum;
    }
}