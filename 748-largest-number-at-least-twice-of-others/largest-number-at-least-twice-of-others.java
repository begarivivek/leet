class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
         int maxInd=0;
         int m=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>m)
            {
                m=nums[i];
                maxInd=i;
            }
        }

        for(int i=0;i<n;i++)
        {
            if(nums[i]!=m && m<2*nums[i]) return -1;
        }
        return maxInd;
    }
}