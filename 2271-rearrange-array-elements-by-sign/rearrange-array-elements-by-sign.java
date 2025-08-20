class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int pa[]=new int[n/2];
        int na[]=new int[n/2];
        int pi=0,ni=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0) pa[pi++]=nums[i];
            else na[ni++]=nums[i];  
        }
        pi=0;
        ni=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0) nums[i]=pa[pi++];
            else nums[i]=na[ni++];
        }
        return nums;
      
    }
}