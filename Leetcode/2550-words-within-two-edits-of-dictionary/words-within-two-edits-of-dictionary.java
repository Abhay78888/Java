class Solution {
    public List<String> twoEditWords(String[] arr, String[] arr1) {
        List<String> ans = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            String word=arr[i];
            for(int j =0;j<arr1.length;j++){
               String dict = arr1[j];
            
            int count =0;
            for(int k =0;k<dict.length();k++){
                if(word.charAt(k)!=dict.charAt(k)){
                    count++;
                }
            }
            if(count<=2){
                ans.add(arr[i]);

                break;
            }
        }
        }
        return ans;
        
    }
}