class Solution {
    public int numberOfBeams(String[] b) {
        int p = 0, ans = 0;
        for (var i : b[0].toCharArray())
            if (i == '1')
                p++;
        for (int i = 1; i < b.length; i++) {
            int c = 0;
            for (var j : b[i].toCharArray()) {
                if (j == '1')
                    c++;
            }
            ans += c * p;
            if (c > 0)
                p = c;
        }
        return ans;
    }
}