class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            if(num%2==0) map.put(num,map.getOrDefault(num,0)+1);
        }
        if(map.isEmpty()) return -1;
        int ans=-1;
        int maxfreq=0;
        for(int num:map.keySet())
        {
            int freq=map.get(num);
           if(freq>maxfreq || freq==maxfreq && num<ans) 
           {
                maxfreq=freq;
                ans=num;
           }
        }
        return ans;
    }
}