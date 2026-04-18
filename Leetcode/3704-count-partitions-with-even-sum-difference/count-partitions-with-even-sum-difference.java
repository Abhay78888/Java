class Solution {
    public int countPartitions(int[] arr) {
        int total=0;

        for(int i =0;i<arr.length;i++){
            total=total+arr[i];        
        }
        int leftsum=0;
        int count=0;

        for(int i =0;i<arr.length-1;i++){
            leftsum=leftsum+arr[i];
            int rightsum=total-leftsum;
            if((rightsum-leftsum)%2==0){
                count++;
            }
        }
        return count;
    }
}