class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        String num=String.valueOf(n).replace("0","");
        if (num.length() == 0) return 0;
        int newNum=Integer.parseInt(num);
        for(int i=0;i<num.length();i++) sum+=Integer.parseInt(String.valueOf(num.charAt(i)));
        return ((long)newNum*sum);
        
    }
}