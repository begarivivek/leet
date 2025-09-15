class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String words[]=text.split(" ");
        int c=0;

        for(String word:words)
        {
            boolean b=false;
            for(char ch:word.toCharArray())
            {
                if(brokenLetters.contains(String.valueOf(ch)))
                {
                    b=true;
                    break;
                }
            }
            if(!b) c++;
        }
        return c;
    }
}