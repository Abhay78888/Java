class Solution {
    public int mirrorDistance(int n) {
        int temp=n;
        int reversed = 0;

        while(temp>0){
            int digit = temp%10;
            reversed = reversed*10+digit;
            temp=temp/10;
        }
        int result =reversed-n;

        if(result<0){
            result=-result;
        }
        return result;
        
    }
}