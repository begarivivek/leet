class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                char prev = sb.charAt(sb.length() - 1);
                int shift = ch - '0';
                sb.append((char)(prev + shift));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
