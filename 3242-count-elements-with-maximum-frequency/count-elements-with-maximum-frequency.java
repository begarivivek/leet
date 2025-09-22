class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxE = 0;
        for (int freq : map.values()) {
            maxE = Math.max(maxE, freq);
        }

        int maxC = 0;
        for (int freq : map.values()) {
            if (freq == maxE) {
                maxC += freq;
            }
        }

        return maxC;
    }
}
