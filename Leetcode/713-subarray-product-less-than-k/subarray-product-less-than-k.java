class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        if(k<=1){
            return 0;
            
        }
        int s=0;
        int e=0;
        int p=1;
        int ans=0;
        while(e<arr.length){
            p=p*arr[e];
            while(p>=k){
                p=p/arr[s];
                s++;
            }
            ans=ans+(e-s+1);
            e++;
        }
        return ans;

        
    }
}