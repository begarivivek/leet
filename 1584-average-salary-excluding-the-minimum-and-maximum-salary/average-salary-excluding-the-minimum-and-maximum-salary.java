class Solution {
    public double average(int[] salary) {
        int tSum=0;
        Arrays.sort(salary);
        int minmaxSum=salary[0]+salary[salary.length-1];
        for(int i=0;i<salary.length;i++)
        {
            tSum+=salary[i];
        }
        double ans=(tSum-minmaxSum)*1.0/(salary.length-2);
        return ans;
    }
}