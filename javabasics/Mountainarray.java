package Array_Practice;

public class Mountainarray {
    public static void main(String[] args) {
        int [] arr={4,5,6,7,0,1,2};
        int ans = mountain(arr);
        System.out.println(ans);

    }





    public static int mountain(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int mid = start + (end -start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }

        }
        return arr[start];

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
}}
