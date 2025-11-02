class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int s=nums[0];
        int l=nums[nums.length-1];
        
        List<Integer> list = new ArrayList<>();
        for(int num:nums) list.add(num);
        List<Integer> ans = new ArrayList<>();

        for(int i=s;i<l;i++)
        {
            if(!list.contains(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}