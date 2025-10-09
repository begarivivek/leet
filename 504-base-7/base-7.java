class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        boolean negNum=num<0;
        num=Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while(num>0)
        {
            int rem=num%7;
            sb.append(rem);
            num/=7;
        }
        if(negNum) sb.append("-");
        return sb.reverse().toString();
    }
}