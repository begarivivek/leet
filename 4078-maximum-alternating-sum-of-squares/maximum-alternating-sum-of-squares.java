class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long res=0;
        for(int i=0;i<nums.length/2;i++){
            res-=nums[i]*nums[i];
        }
        for(int i=nums.length/2;i<nums.length;i++){
            res+=nums[i]*nums[i];
        }
        return res;
    }
}