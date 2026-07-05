class Solution {
    public int maxDigitRange(int[] nums) {
        int sum=0;
        int maxrange=-1;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int max=0;
            int min=Integer.MAX_VALUE;
            
            
            while(temp>0){
                int digit=temp%10;
                max=Math.max(digit,max);
                min=Math.min(digit,min);
                
                temp=temp/10;
                
            }
            int range=max-min;
            if(range>maxrange){
                maxrange=range;
                sum=nums[i];
            }
            else if(maxrange==range){
                sum=sum+nums[i];
            }
            
            
            
        }
        return sum;
        
    }
}