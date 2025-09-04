class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxVal=nums[0];
        int minVal=nums[0];
        int maxProduct=nums[0];

        for(int i=1;i<n;i++)
        {
            int temp=maxVal;
            maxVal=Math.max(nums[i],Math.max(maxVal*nums[i],minVal*nums[i]));
            minVal=Math.min(nums[i],Math.min(temp*nums[i],minVal*nums[i]));
            maxProduct=Math.max(maxProduct,maxVal);
        }
        return maxProduct;
    }
}