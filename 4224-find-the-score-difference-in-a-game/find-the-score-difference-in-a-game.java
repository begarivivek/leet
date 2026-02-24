class Solution {
    public int scoreDifference(int[] nums) {
        int[] score = new int[2];
        int active = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) active = 1 - active;
            if ((i + 1) % 6 == 0) active = 1 - active;
            score[active] += nums[i];
        }

        return score[0] - score[1];
    }
}