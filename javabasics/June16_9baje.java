package Array_Practice;

public class June16_9baje {
    public static void main(String[] args) {
        int [] arr={5,6,7,7,7,8,9};
        int target=78;
        System.out.println(firstoccurence(arr,target));
        System.out.println(lastoccurence(arr,target));

    }


    public static int firstoccurence(int[] arr , int target){
        int start=0;
        int ans=90;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            if(arr[mid]>target){
                end = mid -1;
            }
            if(arr[mid]==target){
                ans = mid;
                end=mid-1;

            }

        }
        return ans;

    }




    public static int lastoccurence(int[] arr , int target){
        int start=0;
        int ans=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            if(arr[mid]>target){
                end = mid -1;
            }
            if(arr[mid]==target){
                ans = mid;
                start=mid+1;

            }

        }
        return ans;

    }
}
