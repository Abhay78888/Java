package Search;

public class SmallestandLArgetsnumber {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int target=1;

        System.out.println("first" +firstOccurence(arr, target));
        System.out.println("last"+lastOccurence(arr, target));


    }
//    public static int[] range(int nums[] , int target){
//        int [] ans ={-1,-1};
//        int start=search(nums , target , true);
//        int end = search(nums , target,false);
//        ans[0]=start;
//        ans[1]=end;
//
//        return ans;
//
//    }
//
//
//    public static int search(int[] nums , int target , boolean findstartindex){
//        int start=0;
//        int ans=-1;
//        int end = nums.length-1;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(nums[mid]<target){
//                end = mid -1;
//
//            }
//            else if (nums[mid]>target){
//                start=mid+1;
//
//            }
//            else{
//                ans = mid;
//                if(findstartindex==true){
//                    end = mid-1;
//                }
//                else{
//                    start = mid +1;
//                }
//
//            }
//
//
//        }
//        return ans;
//
//    }


//    public  static int[] searchRange(int[] nums, int target) {
//        int [] arr={-1,-1};
//        arr[0]=firstOccurence(nums , target);
//        arr[1]=lastOccurence(nums,target);
//        return arr;
//
//
//
//
//    }



    public static int firstOccurence(int arr[] , int target){
        int start =0, ans=-1;

        int end = arr.length -1;
        while(start<=end){
            int mid = start +(end - start)/2;
            if(arr[mid]==target){
                ans = mid;
                end = mid-1;

            }
            else if(target>arr[mid]){
                start = mid +1;

            }
            else{
                end = mid-1;

            }
        }
        return ans;
    }



    public static int lastOccurence(int arr[] , int target){
        int start =0;
        int end = arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid = start +(end - start)/2;
            if(target==arr[mid]){
                ans = mid;
                start = mid + 1;



            }
            else if (target>arr[mid]){
                start=mid+1;

            }
            else{
                end = mid -1;
            }
        }
        return ans;
    }



}
