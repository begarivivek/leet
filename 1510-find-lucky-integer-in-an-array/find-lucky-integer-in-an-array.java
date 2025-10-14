class Solution {
    public int findLucky(int[] arr) {
        int max=-1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet())
        {
            if(key==map.get(key))
            {
                max=Math.max(max,key);
            }
            // else return -1;
        }
        return max;
    }
}