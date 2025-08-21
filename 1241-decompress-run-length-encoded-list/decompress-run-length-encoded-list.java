class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n=nums.length;
        
        for(int i=0;i<n-1;i+=2)
        {
            for(int j=1;j<=nums[i];j++)
            {
                list.add(nums[i+1]);
            }
        }
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
}