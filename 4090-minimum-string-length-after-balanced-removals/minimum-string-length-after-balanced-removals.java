class Solution {
    public int minLengthAfterRemovals(String s) {
        int ac=0,bc=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a') ac++;
            else bc++;
        }
        // if(ac==bc) return 0;
        // if(bc==0) return ac;
        return Math.abs(ac-bc);
    }
}