class Solution {
    public String convertDateToBinary(String date) {
        String []str=date.split("-");
        int a=Integer.parseInt(str[0]);
        int b=Integer.parseInt(str[1]);
        int c=Integer.parseInt(str[2]);

        String d=Integer.toBinaryString(a);
        String e=Integer.toBinaryString(b);
        String f=Integer.toBinaryString(c);

        return d+"-"+e+"-"+f;
    }
}