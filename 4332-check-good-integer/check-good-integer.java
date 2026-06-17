class Solution {
    public boolean checkGoodInteger(int n) {
        int num = n;
        int sum = 0;
        int sq = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            sq += Math.pow(d, 2);
            n = n / 10;
        }

        if (sq - sum >= 50)
            return true;
        return false;
    }
}