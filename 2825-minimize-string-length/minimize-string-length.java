class Solution {
    public int minimizedStringLength(String s) {
        char arr[]=s.toCharArray();
        Set<Character> set = new HashSet<>();
        for(char c:arr)
        {
            set.add(c);
        }
        return set.size();
    }
}