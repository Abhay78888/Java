class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] freq = new int[26];
        for(int i =0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;

        }

        int windsize = s1.length();
        for(int i =0;i<s2.length();i++){
            int winidx=0;
            int idx=i;
            int [] windfreq=new int [26];
            while(winidx<windsize && idx < s2.length()){
                windfreq[s2.charAt(idx)-'a']++;
                idx++;
                winidx++;
            }
            if(same(freq,windfreq)){
                return true;
            }
            
        
        }
        return false;

        
    }
    public static boolean same (int [] freq,int [] winfreq){
        for(int i =0;i<26;i++){
            if(freq[i]!=winfreq[i]){
                return false;
            }
        }
        return true;
    }
}