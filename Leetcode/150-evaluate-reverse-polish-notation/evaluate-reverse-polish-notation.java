class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<tokens.length;i++){
            String value=tokens[i];
            if(value.equals("+")){
                int a=st.pop();
                int b =st.pop();
                st.push(a+b);
            }
            else if(value.equals("*")){
                int a=st.pop();
                int b =st.pop();
                st.push(a*b);
            }
            else if(value.equals("-")){
                int a=st.pop();
                int b =st.pop();
                st.push(b-a);
            }
            else if(value.equals("/")){
                int a=st.pop();
                int b =st.pop();
                st.push(b/a);
            }
            else{
                st.push(Integer.parseInt(value));
            }
            

        }
        return st.peek();
        
        
    }
}