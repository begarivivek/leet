class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x=nums.length;
       int y[]=new int [2];
        for( int i=0;i<x;i++){
            for(int j=i+1;j<x;j++){
                if((nums[i]+nums[j])==target){
                       y[0]=i;
                       y[1]=j;
                       return y;
                
                }
            }
        }
        return y;
    }
}