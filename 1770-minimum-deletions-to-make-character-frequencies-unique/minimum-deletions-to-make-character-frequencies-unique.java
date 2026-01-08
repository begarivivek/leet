class Solution {
    public int minDeletions(String s) {
        int dc=0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        Set<Integer> used = new HashSet<>();
        for(int freq:map.values()){
            while(freq>0 && used.contains(freq)){
                freq--;
                dc++;
            }
            if(freq>0){
                used.add(freq);
            }
        }
        return dc;
        

    }
}