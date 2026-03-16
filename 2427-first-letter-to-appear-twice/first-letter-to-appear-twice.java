class Solution {
    public char repeatedCharacter(String s) {
        char ans='a';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)==2){
                ans=ch;
                break;
            }
        }
        return ans;




        
    }
}