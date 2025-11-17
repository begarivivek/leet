class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        int ans = Integer.MAX_VALUE;
        
        for (List<Integer> idx : map.values()) {
            if (idx.size() < 3) continue; 
            

            for (int i = 0; i + 2 < idx.size(); i++) {
                int a = idx.get(i);
                int c = idx.get(i + 2);
                
                int distance = 2 * (c - a); 
                ans = Math.min(ans, distance);
            }
        }
        
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
