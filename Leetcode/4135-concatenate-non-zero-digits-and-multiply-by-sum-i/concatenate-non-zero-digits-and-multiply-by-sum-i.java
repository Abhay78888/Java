class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long n1=0;
        while(n>0){
            int temp = n %10;
            if(temp!=0){
                sum = sum + temp;
                n1=n1*10+temp;

            }
            n = n /10;
        }
        String strNumber = String.valueOf(n1); 
        StringBuilder sb = new StringBuilder(strNumber);
        String reversedStr = sb.reverse().toString(); 
        
        long reversedInt = Integer.parseInt(reversedStr);
        return(reversedInt*sum);
        
    }
}