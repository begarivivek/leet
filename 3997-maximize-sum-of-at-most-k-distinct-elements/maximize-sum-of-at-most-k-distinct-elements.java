class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        
        List<Integer> list = new ArrayList<>();
        for(int i:set) list.add(i);

        Collections.sort(list,(a,b)-> b-a);
        int size=Math.min(k,list.size());
        int arr[]=new int[size];
        for(int i=0;i<size;i++) arr[i]=list.get(i);

        return arr;



    }
}