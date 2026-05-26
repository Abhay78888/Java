class Solution {
    public int passwordStrength(String s) {
        int point =0;
        HashSet<Character> set = new HashSet<>();
        for(char ch :s.toCharArray()){
            if(set.contains(ch)){
                continue;
            }
            else{
                set.add(ch);
                if(ch>='a' && ch<='z'){
                    point++;
                }
                else if(ch>='A' && ch<='Z'){
                    point = point+2;
                }
                else if(ch>='0' && ch<='9'){
                    point=point+3;
                }
                else{
                    point=point+5;
                }
            }
            
        }
        return point;
        
    }
}