class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans = "";
        for(int i =0;i<words.length;i++){
            String word=words[i];
            int sum=0;
            for(int j =0;j<word.length();j++){
                char c = word.charAt(j);
                sum=sum+weights[c-'a'];
                
            }
            sum=sum%26;
            ans = ans + (char)('z'-sum);
        }
        return ans;
        
        

        
    }
}