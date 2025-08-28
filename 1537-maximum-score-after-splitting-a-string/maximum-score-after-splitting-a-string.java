class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int totalOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') totalOnes++;
        }
        
        int zerosLeft = 0, onesRight = totalOnes;
        int maxScore = Integer.MIN_VALUE;
        
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') zerosLeft++;
            else onesRight--;
            
            int score = zerosLeft + onesRight;
            maxScore = Math.max(maxScore, score);
        }
        
        return maxScore;
    }
}
