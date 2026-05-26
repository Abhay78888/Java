class Solution {
    public int numberOfSpecialChars(String word) {
        int [] freq= new int [26];
        int[] freq1= new int[26];

        for(char ch : word.toCharArray()){
            if(ch>='a' && ch<='z'){
                freq[ch-'a']++;
            }
            else if(ch>='A' && ch<='Z'){
                freq1[ch-'A']++;
            }
        }
        int count=0;

        for(int i =0;i<freq.length;i++){
            if(freq[i]>0 && freq1[i]>0){
                count++;
            }

        }
        return count;
        
    }
}