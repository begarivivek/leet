class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int [][]pairs=new int[n][2];
        for(int i=0;i<n;i++)
        {
            pairs[i][0]=nums2[i];
            pairs[i][1]=nums1[i];
        }

        Arrays.sort(pairs,(a,b)->b[0]-a[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum=0, maxScore=0;
        for(int[] pair:pairs)
        {
            int n2=pair[0];
            int n1=pair[1];


            pq.offer(n1);
            sum+=n1;

            if(pq.size()>k)
            {
                sum-=pq.poll();
            }

            if(pq.size()==k)
            {
                long score=sum*n2;
                maxScore=Math.max(maxScore,score);
            }
        }
        return maxScore;
    }
}