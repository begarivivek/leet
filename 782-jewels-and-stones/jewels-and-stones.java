class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        char[] arr1=jewels.toCharArray();
        char[] arr2=stones.toCharArray();

        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j]) c++;
            }
        }
        return c;

    }
}