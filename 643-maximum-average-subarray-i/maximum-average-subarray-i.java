class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        int l = 0;

        for (int r = k; r < arr.length; r++) {
            sum = sum - arr[l];
            l++;
            sum = sum + arr[r];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}