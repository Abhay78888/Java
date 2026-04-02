class Solution {
    public int reverse(int N) {
        int sign =1;
        if(N<0){
            sign = -1;
            N=-N;
        }
        long sum =0;
        while(N>0){
            int rem = N%10;
            sum = sum *10 + rem;
            N=N/10;

        }
            if (sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE) {
            return 0;
        }
        sum = sum * sign;
        return (int) sum;
        
        
    }
}