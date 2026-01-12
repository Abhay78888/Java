package JavaBasics;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int nums[]={5,1,0,0};

        //System.out.println( search(nums,5));
        System.out.println(findPeakElement(nums));
    }

        public static int findPeakElement(int[] arr) {
            int start=0; int end= arr.length-1;

            while(start < end){
                int mid = start + (end-start)/2;

                if(arr[mid] > arr[mid +1]){
                    end=mid;
                }
                else{
                    start=mid+1;
                }
            }
            return start;
        }



    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int first =bs(nums, 0, pivot,target);
        if(first == -1){
         int second = bs(nums,pivot+1, nums.length-1,target);
         return second;
        }
        else return first;
    }

    public static int bs(int [] nums, int start, int end, int target){
        while( start <= end){
            int mid = start +( end-start)/2;

            if( nums[mid]> target){
                end = mid -1;
            }

            else if(nums[mid]< target){
                start=mid+1;
            }
            else if( nums[mid] == target){
                return mid;
            }
        }
        return -1;
    }

    public static int findPivot(int [] nums){
//        int start=0;
//        int end= nums.length-1;
//
//        while(start < end){
//            int mid= start +(end-start)/2;
//            if( nums[mid]> nums[mid+1] ){
//                end=mid;
//            }
//            else{
//                start=mid+1;
//            }
//        }
//        return start;

        Arrays.sort(nums);
        return nums[nums.length-1];
    }

}