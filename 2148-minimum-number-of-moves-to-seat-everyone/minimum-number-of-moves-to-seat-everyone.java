class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int n=seats.length;
        int m=students.length;
        int ans=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<=i;j++)
            {
                ans+=Math.abs(seats[i]-students[j]);
            }
        }
        return ans;
    }
}