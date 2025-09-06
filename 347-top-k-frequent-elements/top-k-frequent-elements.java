class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]=new int[k];

        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:nums)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
       
        List<Integer> list = new ArrayList<>(freq.keySet());

        Collections.sort(list, (a,b)-> freq.get(b)-freq.get(a));

        for(int i=0;i<k;i++) ans[i]=list.get(i);
        return ans;
    }
}