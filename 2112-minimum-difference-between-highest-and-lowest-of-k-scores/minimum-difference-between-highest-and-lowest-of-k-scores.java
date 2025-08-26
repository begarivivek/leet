import java.util.*;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums); // Step 1: sort the array

        // Step 2: put sorted nums into an ArrayList
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        int minDiff = Integer.MAX_VALUE;

        // Step 3: check all windows of size k in the list
        for (int i = 0; i <= list.size() - k; i++) {
            int diff = list.get(i + k - 1) - list.get(i); // difference of window
            if (diff < minDiff) {
                minDiff = diff; // update if smaller
            }
        }

        return minDiff; // Step 4: return the minimum difference
    }
}
