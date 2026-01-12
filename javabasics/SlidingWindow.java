package Array_Practice;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3 , 4, 5, 6, 7, 8, 9};
        int k = 3;
        int ans =MAxSum(arr,k);
        System.out.println(ans);



    }

    public static int MAxSum(int [] arr,int k) {
        int sum = 0;
        int ans = 0;
        for (int i = 0; i <k ; i++) {
            sum=sum+arr[i];

        }
        ans = sum;
        for (int i = k; i <arr.length ; i++) {
            sum=sum+arr[i];
            sum=sum-arr[i-k];
            ans = Math.max(sum,ans);

        }
        return ans;

    }
}
