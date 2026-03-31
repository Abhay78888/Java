class Solution {
    public int compress(char[] arr) {
        int n=arr.length;
        int idx=0;
        for(int i =0;i<n;){
            char ch = arr[i];
            int count = 0;
            while(i<n && arr[i]==ch){
                count++;
                i++;
            }
            if(count==1){
                arr[idx]=ch;
                idx++;
            }
            else{
                arr[idx]=ch;
                idx++;
                String str = Integer.toString(count);
                for(char dig : str.toCharArray()){
                    arr[idx]=dig;
                    idx++;
                }

            }
            
        }
        return idx;

        
        
    }
    
}