class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];
        int moves=0;
        for(int num:nums)
        {
            min=Math.min(min,num);
        }

        for(int i=0;i<nums.length;i++)
        {
           moves+=nums[i]-min;
            
        }
        return moves;
    }
}