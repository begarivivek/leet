class Solution {
    public int maximumGap(int[] nums) {
        int max=0;
        if(nums.length<2) return 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(Math.abs(nums[i]-nums[i+1])>max){
                max=Math.max(max,(Math.abs(nums[i]-nums[i+1])));
            }
        }
        return max;
    }
}