class Solution {
    public long minCost(String s, int[] cost) {
        long tc=0;
        long minCost=Long.MAX_VALUE;
        for(int i:cost) tc+=i;
        Map<Character, Long> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0L)+cost[i]);
        }
        long delCost=0;
        for(long val:map.values()){
            delCost=(long)tc-val;
            minCost=Math.min(minCost,delCost);
        }
        return minCost;
    }
}