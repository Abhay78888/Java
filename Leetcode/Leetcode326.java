package Leetcode;

public class Leetcode326 {
    public static void main(String[] args) {
        int n = 81;
        System.out.println(check(n));


    }

    public static boolean check(int n  ) {
        int low = 0;
        int high=19;
        while(low<=high){
            int mid = low + (high-low)/2;
            long power = (long)Math.pow(3,mid);
            if(power==n){
                return true;
            }
            else if (power<n){
                low = mid +1;
            }
            else{
                high = mid -1;

            }
        }
        return false;

    }
}
