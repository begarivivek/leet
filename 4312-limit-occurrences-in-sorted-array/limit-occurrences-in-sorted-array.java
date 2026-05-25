class Solution {
    public int[] limitOccurrences(int[] nums, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {

            if(list.size() < k) {
                list.add(nums[i]);
            }

            else if(nums[i] != list.get(list.size() - k)) {
                list.add(nums[i]);
            }
        }

        int[] res = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}