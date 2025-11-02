class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;
        while (i < chars.length) {
            char ch = chars[i];
            int c = 0;

            while (i < chars.length && chars[i] == ch) {
                i++;
                c++;
            }
            chars[j] = ch;
            j++;

            if (c > 1) {
                String num = String.valueOf(c);
                for (char x : num.toCharArray()) {
                    chars[j] = x;
                    j++;
                }
            }

        }
        return j;

    }
}