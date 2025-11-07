class Solution {
    public int reverseDegree(String s) {
        
        int count = 0;

        for(int i = 1;i<=s.length();i++){
            int val = 'z'- s.charAt(i-1) + 1;
           count += i * val;
        }

        return count;
    }
}