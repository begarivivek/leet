class Solution {
    public int maxProduct(int[] nums) {
        int maxValue=nums[0];
        int minValue=nums[0];
        int maxProduct=nums[0];

        for(int i=1;i<nums.length;i++){
            int temp=maxValue;
            maxValue=Math.max(nums[i],Math.max(maxValue*nums[i],minValue*nums[i]));
            minValue=Math.min(nums[i],Math.min(temp*nums[i],minValue*nums[i]));
            maxProduct=Math.max(maxProduct,maxValue);
        }
        return maxProduct;
    }
}