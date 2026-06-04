class Solution {
    public int minPairSum(int[] arr) {
        Arrays.sort(arr);
        int i =0;
        int j =arr.length-1;
        int max=Integer.MIN_VALUE;
        
        while(i<j){
            max=Math.max(arr[i]+arr[j],max);
            i++;
            j--;
        }
        return max;

        
    }
}