class Solution {
    public String largestGoodInteger(String num) {
        for (int i = 9; i >= 0; i--) {
            String triple = "" + i + i + i;
            if (num.contains(triple)) {
                return triple;
            }
        }
        return "";

    }
}