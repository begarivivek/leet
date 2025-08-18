class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans= new ArrayList<>();
        int n=candies.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=candies[i];
        }
        Arrays.sort(arr);
        int max=arr[n-1];
        for(int i=0;i<n;i++)
        {
            if(candies[i]+extraCandies>=max) ans.add(true);
            else ans.add(false);
        }
        return ans;

    }
}