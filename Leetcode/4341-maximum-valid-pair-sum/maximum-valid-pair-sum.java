class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxSum=Integer.MIN_VALUE;
        int maxval=nums[0];
        for(int i=k;i<nums.length;i++){
            maxval=Math.max(maxval,nums[i-k]);
            maxSum=Math.max(maxSum,nums[i]+maxval);

        }
        return maxSum;
    }
}