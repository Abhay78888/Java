class Solution {
    public String firstPalindrome(String[] words) {
        for(int i =0;i<words.length;i++){
            String word=words[i];
            if(palindrome(word)==true){
                return word;
                
            }
        }
        return "";

        
    }
    public static boolean palindrome(String str){
        String str1="";
    
        for(int i = str.length()-1;i>=0;i--){
            str1 = str1 + str.charAt(i);
            
        }
        if(str.equals(str1)){
            return true;
        }
        return false;
    }
}