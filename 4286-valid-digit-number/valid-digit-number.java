class Solution {
    public boolean validDigit(int n, int x) {
        String str=Integer.toString(n);
        char strX=(char)(x+'0');

        if(str.charAt(0)==strX) return false;
        if(!str.contains(String.valueOf(strX))) return false;

        return true;

    }
}