class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for(char ch:s.toCharArray())
        {
            if("aeiouAEIOU".contains(String.valueOf(ch)))
            {
                vowels.add(ch);
            }
        }
        Collections.sort(vowels);

        StringBuilder sb = new StringBuilder(s);
        int idx=0;
        for(int i=0;i<sb.length();i++)
        {
            if("aeiouAEIOU".indexOf(sb.charAt(i))!=-1)
            {
                sb.setCharAt(i,vowels.get(idx++));
            }
        }
        return sb.toString();
    }
}