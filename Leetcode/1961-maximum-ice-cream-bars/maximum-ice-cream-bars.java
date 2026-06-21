class Solution {
    public int maxIceCream(int[] arr, int coins) {
        Arrays.sort(arr);
        int count=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<=coins){
                count++;
                coins=coins-arr[i];
            }
            else{
                break;
            }


        }
        return count;
        
        
    }
}