class Solution {
    public boolean check(int[] arr) {
        int j =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                j++;
            }
          
        }
        if(j>1){
            return false;
        }
        return true;
       


        
    }
}