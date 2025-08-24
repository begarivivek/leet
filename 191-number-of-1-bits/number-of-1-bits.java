class Solution {
    public int hammingWeight(int n) {
       int c=0;
       String ns= Integer.toBinaryString(n);
       for(int i=0;i<ns.length();i++)
       {
        if(ns.charAt(i)=='1') c++;
       }
       return c;



    }
}