class Solution {
    public int minOperations(int[] nums) {
        int ans[]=new int[nums.length];
        int indx=0;
        int c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1]) continue;
            else
            {
                int e=nums[i+1];
                nums[i+1]=nums[i]+1;
                c+=nums[i+1]-e;
            }
        }
        return c;
    }
}