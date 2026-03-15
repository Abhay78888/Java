class Solution {
    public int mostWordsFound(String[] sentences) {
        int total =0;
        for(int i =0;i<sentences.length;i++){
            if(spaces(sentences[i])+1>total){
                total = spaces(sentences[i])+1;
            }
        }
        return total;
        
        
    }
    public static  int spaces(String word){
        
        int count = 0;
        char [] space = word.toCharArray();

        for(int i =0;i<space.length;i++){
            if(space[i]==' '){
                count++;
            }
        }
        return count;
    } 
}