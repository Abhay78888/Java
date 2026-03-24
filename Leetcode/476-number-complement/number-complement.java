class Solution {
    public int findComplement(int num) {
           String bnum = Integer.toBinaryString(num);
        StringBuilder flip= new StringBuilder();
        for(int i =0;i<bnum.length();i++){
            if(bnum.charAt(i)=='0'){
                flip.append('1');
            }
            else{
                flip.append('0');
            }
        }
        return Integer.parseInt(flip.toString(),2);
        
    }
}