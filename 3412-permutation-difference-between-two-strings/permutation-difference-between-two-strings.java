class Solution {
    public int findPermutationDifference(String s, String t) {
       Map<Character,Integer> smap= new HashMap<>();
       Map<Character,Integer> tmap= new HashMap<>();

       for(int i=0;i<s.length();i++)
       {
            smap.put(s.charAt(i),i);
       }
       for(int i=0;i<t.length();i++)
       {
            tmap.put(t.charAt(i),i);
       }
       int sum=0;
       for(var ch:s.toCharArray())
       {
            sum+=Math.abs(smap.get(ch)-tmap.get(ch));
       }
       return sum;
    }
}