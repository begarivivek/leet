class Solution {
    public int[] sumZero(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n/2;i++)
        {
            list.add(-i);
            list.add(i);
        }
        if(n%2==1) list.add(0);

        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}