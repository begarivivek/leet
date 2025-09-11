class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            List<Integer> temp = new ArrayList<>();
            while(nums[i]!=0)
            {
                int digit=nums[i]%10;
                nums[i]=nums[i]/10;
                temp.add(digit);
            }

            for(int j=temp.size()-1;j>=0;j--)
            {
                list.add(temp.get(j));
            }
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
        
    }
}