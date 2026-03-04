class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
       

        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))) c++;
        }

         int maxCount=c;
         int l=0;
         for(int r=k;r<s.length();r++){
            if(isVowel(s.charAt(l))) c--;
            l++;
            if(isVowel(s.charAt(r))) c++;

            maxCount=Math.max(maxCount,c);
         }
        return maxCount;
    }
    private boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}