class Solution {
    public int countPrimeSetBits(int left, int right) {
        int pc = 0;
        for (int i = left; i <= right; i++) {
            int c = 0;
            String bn = Integer.toBinaryString(i);
            for (int j = 0; j < bn.length(); j++) {
                if (bn.charAt(j) == '1')
                    c++;
            }
            if (c == 2 || c == 3 || c == 5 || c == 7 || c == 11 || c == 13 || c == 17 || c == 19) {
                pc++;
            }
        }
        return pc;
    }
}