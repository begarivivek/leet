class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int lp[]=new int[n];
        int gp[]=new int[n];
        int ans[]=new int[n];
        int c=0;
        int lpIndx=0,gpIndx=0;

        for(int i=0;i<n;i++)
        {
            if(nums[i]<pivot)
            {
                lp[lpIndx++]=nums[i];
                
            }
            if(nums[i]==pivot) c++;
            else if(nums[i]>pivot)
            {
                gp[gpIndx++]=nums[i];
            }
        }
        for(int i=1;i<=c;i++)
        {
            lp[lpIndx++]=pivot;
        }
        int idx=0;
        for(int i=0;i<lpIndx;i++)
        {
            nums[idx++]=lp[i];
        }
        for(int i=0;i<gpIndx;i++)
        {
            nums[idx++]=gp[i];
        }
        return nums;


    }
}