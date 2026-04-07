class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            char curr = s.charAt(i);
            if(!st.isEmpty() && st.peek()==curr){
                st.pop();
            }
            else{
            st.push(curr);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : st) {
            result.append(c);
        }

        return result.toString();
        
    }
}