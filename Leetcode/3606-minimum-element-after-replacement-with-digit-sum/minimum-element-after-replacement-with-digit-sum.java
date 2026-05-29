class Solution {
    public int minElement(int[] nums) {
        for(int i =0;i<nums.length;i++){
            int n=nums[i];
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum=sum+digit;
                n=n/10;

            }
            nums[i]=sum;
        }
        int min=Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            min=Math.min(min,nums[i]);

        }
        return min;

        
    }
}