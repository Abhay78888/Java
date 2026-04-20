class Solution {
    public int hIndex(int[] arr) {
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            int ans= Math.min(arr[i],arr.length-i);
            count = Math.max(count,ans);
        }
        return count;
    }
}