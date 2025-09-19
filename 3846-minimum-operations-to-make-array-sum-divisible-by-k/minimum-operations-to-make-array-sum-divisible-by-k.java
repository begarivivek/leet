class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int c=0;
        for(int i:nums) sum+=i;
        
        while(sum%k!=0)
        {
            c++;
            sum--;
        }
        return c;

    }
}