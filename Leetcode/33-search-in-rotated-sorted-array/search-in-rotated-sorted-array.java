class Solution {
    public int search(int[] nums, int target) {
        int pivott = pivot(nums);
        if(target>=nums[pivott] && target<=nums[nums.length-1]){
            return bs(nums,target,pivott,nums.length-1);
        }
        return bs(nums,target,0,pivott-1);
        
    }
    public int pivot(int [] nums ){
        int start=0;
        int end= nums.length-1;
        while(start<end){
            int mid= start+(end - start)/2;
            if(nums[mid] > nums[end]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;

    }

    public int bs(int [] nums , int target , int start , int end){
        while(start<=end){
            int mid = start+(end - start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start= mid+1;
            }
        }
        return -1;
        

    }
}