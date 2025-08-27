class Solution {
    public int[] replaceElements(int[] arr) {
        int res[]=new int[arr.length];
        int currMax=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            res[i]=currMax;
            currMax=Math.max(currMax,arr[i]);
        }
        return res;
    }
}