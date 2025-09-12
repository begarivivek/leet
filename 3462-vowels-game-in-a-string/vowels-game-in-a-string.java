class Solution {
    public boolean doesAliceWin(String s) {
        for(char ch:s.toCharArray())
        {
            if("aeiou".contains(String.valueOf(ch))) return true;
        }
        return false;
    }
}