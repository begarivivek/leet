class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max=0;
        int oc=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                oc++;
                max=Math.max(max,oc);
            }
            else oc=0;
        }
        return max;
    }
}