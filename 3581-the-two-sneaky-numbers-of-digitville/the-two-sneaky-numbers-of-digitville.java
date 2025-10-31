class Solution {
    public int[] getSneakyNumbers(int[] nums)
    {
        int n=nums.length;
       
        Arrays.sort(nums);
        ArrayList<Integer> lst=new ArrayList<>();
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1]){
            lst.add(nums[i]);}
        }
        int ans[]=new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            ans[i]=lst.get(i);
        }
        return ans;
        
    }
}