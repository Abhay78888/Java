package Array_Practice;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,12,23,34,42,45,67};
        int target=67;
        int ans = search(arr,target);
        System.out.println(ans);
    }


    public static int search(int[] arr , int target ){
        int start=0;
        int end =1;
        while(arr[end]< target){
            start = end;
            end = 2 * end;
        }
        return binarysearch(arr , target,start,end);
    }


    public static int binarysearch(int[] arr, int target , int start , int end){
        while(start<=end){
            int mid=start+(end - start)/2;
            if(target>arr[mid]){
                start = mid +1;
            }
            else if(target<arr[mid]){
                end = mid-1;

            }
            else{
                return mid;
            }
        }
        return -1;

    }
}
