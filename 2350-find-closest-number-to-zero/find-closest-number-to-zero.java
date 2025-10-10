class Solution {
    public int findClosestNumber(int[] nums) {
       int n= nums.length;
       int closestNum=nums[0];

       for(int i=1;i<n;i++)
       {
        int curr=nums[i];
        if(Math.abs(curr)<Math.abs(closestNum))
        {
            closestNum=curr;
        }
        else if(Math.abs(curr)==Math.abs(closestNum) && curr>closestNum)
        {
            closestNum=curr;
        }
       }

       return closestNum;
       
        
    }
}