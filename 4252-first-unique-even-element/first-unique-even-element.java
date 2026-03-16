class Solution {
    public int firstUniqueEven(int[] nums) {
        int c=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.print(map);
        for(int i:nums){
            if(i%2==0 && map.get(i)==1) return i;
        }
        return -1;
    }
}