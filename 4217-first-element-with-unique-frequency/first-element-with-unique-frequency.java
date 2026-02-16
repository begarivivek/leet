class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int c : map.values()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (int num : nums) {
            int elementFreq = map.get(num);
            if (freq.get(elementFreq) == 1) {
                return num;
            }
        }
        return -1;
    }
}