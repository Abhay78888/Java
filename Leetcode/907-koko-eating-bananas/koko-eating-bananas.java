class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int low=1;
        int high=max(arr);
        while(low<=high){
            int mid=low+(high-low)/2;
            long totalH=eat(arr,mid);
            if(totalH<=h){
                high=mid-1;

            }
            else{
                low=mid+1;
            }

        }
        return low;
        
    }
    public static int max(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            max=Math.max(max,arr[i]);

        }
        return max;
    }

    public static long eat(int [] arr , int hour){
        long totalH=0;
        for(int i=0;i<arr.length;i++){
            totalH += ((long)arr[i] + hour - 1) / hour;

        }
        return totalH;
    }
}