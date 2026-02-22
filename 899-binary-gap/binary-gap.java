class Solution {
    public int binaryGap(int n) {
        String nn = Integer.toBinaryString(n);
        int start=-1;
        int gap=0;
        for(int i=0;i<nn.length();i++){
            if(nn.charAt(i)=='1'){
                if(start!=-1){
                    gap=Math.max(gap,i-start);
                }
                start=i;
            }    
        }
        return gap;
    }
}