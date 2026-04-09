class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> st = new Stack<>();
        Stack <Character> st1= new Stack<>();

        for(int i =0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st.push(s.charAt(i));
            }
            else{
                if(!st.isEmpty()){
                st.pop();
                
            }}
        }
          for(int i =0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                st1.push(t.charAt(i));
            }
            else{
                if(!st1.isEmpty()){
                st1.pop();
            }}
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        String result = sb.reverse().toString();
        StringBuilder sb1 = new StringBuilder();
        while (!st1.isEmpty()) {
            sb1.append(st1.pop()); 
        }
        String result1 = sb1.reverse().toString();
        if ( result.equals(result1)){
            return true;
        }
        else{
            return false;
        }

        
    }
}