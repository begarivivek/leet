class Solution {
    public int buyChoco(int[] nums, int money) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(nums[i]+nums[j]<=money)
                {
                    money-=nums[i];
                    money-=nums[j];
                    return money;
                }
            }
        }
        return money;
    }
}