class Solution {
    public String greatestLetter(String s) {
        int []upper = new int[26];
        int []lower = new int[26];
        for(int i =0;i<s.length();i++){

            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                upper[ch-'A']++;
            }   
            

        }
         for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
             if(ch >= 'a' && ch <= 'z'){
                lower[ch-'a']++;
            }   
            

        }

        
        int ans =0;
        for(int i=25;i>=0;i--){
            if(upper[i]>0 && lower[i]>0){
                return "" +(char)(i+'A');
            }
            
        }
        return "";
        
    }
}