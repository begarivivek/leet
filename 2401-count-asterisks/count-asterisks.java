class Solution {
    public int countAsterisks(String s) {
        StringBuilder sb=new StringBuilder();
        int c=0;
        String [] arr=s.split("\\|");
        for(int i=0;i<arr.length;i+=2)
        {
            sb.append(arr[i]);
        }

        for(char ch:sb.toString().toCharArray())
        {
            if(ch=='*') c++;
        }
        return c;
    }
}