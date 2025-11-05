class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n-k; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < i + k && j < n; j++) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            }

            PriorityQueue<int[]> pq = new PriorityQueue<>(
                    (a, b) -> (a[1] == b[1]) ? b[0] - a[0] : b[1] - a[1]);

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                pq.add(new int[] { entry.getKey(), entry.getValue() });
            }

            int sum = 0;
            int count = 0;
            while (!pq.isEmpty() && count < x) {
                int[] top = pq.poll();
                sum += top[0] * top[1];
                count++;
            }
            list.add(sum);

        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;

    }
}