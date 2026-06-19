
class Solution {
    public int largestAltitude(int[] arr) {
             
        int sum = 0;
        int max =0;

        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
            max = Math.max(sum,max);



        }
        return max;
        
        
    }
}
