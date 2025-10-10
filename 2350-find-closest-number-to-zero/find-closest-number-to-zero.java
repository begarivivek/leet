class Solution {
    public int findClosestNumber(int[] nums) {
        List<int[]> l = new ArrayList<>();
        for(var i : nums)
            l.add(new int[]{i,Math.abs(i)});
        Collections.sort(l,(a,b)->a[1]-b[1]);
        int min = l.get(0)[1], res = l.get(0)[0];
        for(var  i : l)
            if(res < i[0] && min == i[1])res=i[0];
       return res;
    }
}