class Solution {
    public int maxFreqSum(String s) {
        int maxV=0;
        int maxC=0;
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c:s.toCharArray())
        {
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        for(char ch : freq.keySet())
        {
            int c=freq.get(ch);
            if("aeiou".contains(String.valueOf(ch)))
            {
                maxV=Math.max(c,maxV);
            }
            else
            {
               maxC=Math.max(c,maxC);
            }
        }
        return maxV+maxC;
    }
}