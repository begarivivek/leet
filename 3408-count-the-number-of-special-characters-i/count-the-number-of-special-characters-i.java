class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> s = new HashSet<>();

        for(char c : word.toCharArray()){
            s.add(c);
        }
        int count=0;
        for(char c='a';c<='z';c++){
            if(s.contains(c) && s.contains(Character.toUpperCase(c))) count++;
        }

        return count;
    }
}