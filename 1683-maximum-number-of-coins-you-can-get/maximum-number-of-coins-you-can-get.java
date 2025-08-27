class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int maxCoins=0;
        int i=0;
        int j=piles.length-2;
        while(i<j)
        {
            maxCoins+=piles[j];
            i++;
            j-=2;
        }
        return maxCoins;
    }
}