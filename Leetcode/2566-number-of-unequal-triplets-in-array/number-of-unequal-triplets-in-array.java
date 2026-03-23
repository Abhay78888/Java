class Solution {
    public int unequalTriplets(int[] nums) {
        int count =0;

        for(int i =0;i<nums.length;i++){
             for(int j =1;j<nums.length;j++){
                 for(int k =2;k<nums.length;k++){
                    if(i<j && i<k && j<k && i<nums.length && j<nums.length && k<nums.length && nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]   ){
                        count ++;

                    }
                    

            
        }
  
            
        }   

        }  
        return count;      
    }
}