class Solution {
    public String[] findWords(String[] words) {
        int n=words.length;
        List<String> list = new ArrayList<>();
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Set<Character> set3 = new HashSet<>();

        String r1="qwertyuiopQWERTYUIOP";
        String r2="asdfghjklASDFGHJKL";
        String r3="zxcvbnmZXCVBNM";

        for(char ch:r1.toCharArray())
        {
            set1.add(ch);
        }
        for(char ch:r2.toCharArray())
        {
            set2.add(ch);
        }
        for(char ch:r3.toCharArray())
        {
            set3.add(ch);
        }

        for(int i=0;i<words.length;i++)
        {
            int c1=0,c2=0,c3=0;
            String s=words[i];
            for(int j=0;j<s.length();j++)
            {
                if(set1.contains(s.charAt(j))) c1++;
                else if(set2.contains(s.charAt(j))) c2++;
                else
                {
                     set3.contains(s.charAt(j)); 
                     c3++;
                }
            }
            if(c1==s.length()||c2==s.length()||c3==s.length()) list.add(s);
        }





        String ans[] = new String[list.size()];
        for(int i=0;i<list.size();i++)
        {
            ans[i]=list.get(i);
        }
        return ans;

    }
}