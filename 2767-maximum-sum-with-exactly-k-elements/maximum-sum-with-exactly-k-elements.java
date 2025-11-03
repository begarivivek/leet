class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        int num=nums[nums.length-1];
        for(int i=0;i<k;i++)
        {
            sum+=num;
            num++;
        }
        return sum;
    }
}