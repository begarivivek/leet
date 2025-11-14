class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
    for(var i:tokens){
        if("+-*/".contains(i)){
            int val1 = st.pop();
            int val2 = st.pop();
            if(i.equals("+")){
                st.push(val2 + val1);
            }
            else if(i.equals("-")){
                  st.push(val2 - val1);
            }
            else if(i.equals("*")){
                  st.push(val2 * val1);
            }
            else if(i.equals("/")){
                  st.push(val2 / val1);
            }
        }
        else{
            
            st.push(Integer.parseInt(i));
        }
    }
    return st.peek();   
    
}
    
}