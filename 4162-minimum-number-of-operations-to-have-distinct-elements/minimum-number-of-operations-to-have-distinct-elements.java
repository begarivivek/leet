class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        int duplicates = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) == 2) {
                duplicates++;
            }
        }

        if (duplicates == 0) return 0;

        int ops = 0;
        int i = 0;

        while (i < n && duplicates > 0) {
            ops++;

            for (int k = 0; k < 3 && i < n; k++, i++) {
                int val = nums[i];
                int count = map.get(val) - 1;
                map.put(val, count);

                if (count == 1) {
                    duplicates--;
                }
            }
        }

        return ops;
    }
}
