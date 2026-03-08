class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n=capacity.length;
        int min=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(capacity[i]>=itemSize){
                if(capacity[i]<min){
                    min=capacity[i];
                    idx=i;
                }
            }
        }
        return idx;

        
    }
}