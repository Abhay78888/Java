class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        StringBuilder newStr2= new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                newStr.append(Character.toLowerCase(ch));
            }
        }
        for (int i = newStr.length()-1; i>=0 ; i--) {
            char ch = newStr.charAt(i);
            newStr2.append(ch);

        }
        return newStr.toString().equals(newStr2.toString());
        
    }
}