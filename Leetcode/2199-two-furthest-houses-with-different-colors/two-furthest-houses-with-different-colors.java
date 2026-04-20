class Solution {
    public int maxDistance(int[] arr) {
        int max =0;
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    int diff = Math.abs(i-j);
                    max=Math.max(max,diff);
                }
            }
        }
        return max;
    }
}