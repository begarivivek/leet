class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int val:map.keySet())
        {
            if(map.get(val)%k==0)
            {
                sum+=val*map.get(val);
            }
        }
        return sum;
    }
}