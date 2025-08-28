class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int zc=0,sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)=='0')
            {
                zc++;
            }
            int oc=0;
            for(int j=i+1;j<n;j++)
            {
                if(s.charAt(j)=='1')
                {
                    oc++;
                }
            }
            sum=zc+oc;
            if(sum>maxSum) maxSum=sum;

        }
        return maxSum;
    }
}