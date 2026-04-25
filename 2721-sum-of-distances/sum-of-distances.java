class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        for (List<Integer> list : map.values()) {
            int size = list.size();

            long totalSum = 0;
            for (int idx : list) {
                totalSum += idx;
            }

            long leftSum = 0;

            for (int i = 0; i < size; i++) {
                int curr = list.get(i);

                long left = (long)i * curr - leftSum;
                long right = (totalSum - leftSum - curr) - (long)(size - i - 1) * curr;

                ans[curr] = left + right;

                leftSum += curr;
            }
        }

        return ans;
    }
}