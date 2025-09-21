class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        String nums1[]=num1.split("\\+");
        String nums2[]=num2.split("\\+");

        int a=Integer.parseInt(nums1[0]);
        int b=Integer.parseInt(nums1[1].replace("i",""));
        int c=Integer.parseInt(nums2[0]);
        int d=Integer.parseInt(nums2[1].replace("i",""));

        int real=(a*c)-(b*d);
        int img=(a*d)+(b*c);

        sb.append(real);
        sb.append("+");
        sb.append(img);
        sb.append("i");

        return sb.toString();
    }
}