class Solution {
    public int numberOfSpecialChars(String word) {
        int [] freq = new int[26];
        int [] freq1= new int[26];
        Arrays.fill(freq,-1);
        Arrays.fill(freq1,Integer.MAX_VALUE);

        for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);

        if (ch >='a' && ch <= 'z') {
            freq[ch-'a']=i;
            }
        else if (ch >='A' && ch<='Z') {
            freq1[ch-'A']=Math.min(i,freq1[ch-'A']);
            }
        }
        int count=0;
        for(int i =0;i<freq.length;i++){
            if(freq[i]!=-1 && freq1[i]!=Integer.MAX_VALUE && freq[i]<freq1[i]){
                count++;
            }

        }
        return count;


        
    }
}