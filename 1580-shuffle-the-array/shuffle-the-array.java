class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];
        int indx=0;
        for(int i=0;i<n;i++){
            ans[indx]=nums[i];
            ans[indx+1]=nums[i+n];
            indx+=2;
        }
        return ans;
    }
}