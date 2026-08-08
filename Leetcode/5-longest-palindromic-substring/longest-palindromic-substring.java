class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        String ans="";

        for(int i =0;i<s.length();i++){
            String odd=check(s,i,i);
            String even=check(s,i,i+1);
            if(odd.length()>ans.length()) ans=odd;
            if(even.length()>ans.length()) ans=even;
        }
        return ans;

        
    }
    public static String check(String s , int left , int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right) ){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}