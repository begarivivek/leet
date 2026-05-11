class Solution {
    public int sumOfPrimesInRange(int n) {
        int nn = n;
        int rev = 0;
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }

        int start = Math.min(nn, rev);
        int end = Math.max(nn, rev);

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}