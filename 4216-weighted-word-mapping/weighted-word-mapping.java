class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();  

        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            int sum = 0;

            for (int j = 0; j < s.length(); j++) {
                sum += weights[s.charAt(j) - 'a'];
            }

            int value = sum % 26;
            char ch = (char) ('z' - value);

            ans.append(ch);  
        }

        return ans.toString();  
    }
}