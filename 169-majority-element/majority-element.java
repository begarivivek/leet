class Solution {
    public int majorityElement(int[] nums) {
        int element=0,c=0;

        for(int num:nums)
        {
            if(c==0) element=num;
            if(num==element) c++;
            else c--;
        }
        return element;
    }
}