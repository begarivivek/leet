class Solution {
    public int reverseBits(int n) {
        String bn = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bn.length(); i++) {
            char ch = bn.charAt(i);
            sb.append(ch);

        }
        sb.reverse();
        String rbn = sb.toString();

        return (int) Long.parseLong(rbn, 2);
        
    }
}