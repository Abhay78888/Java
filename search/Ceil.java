package Search;
import java.util.Scanner;

public class Ceil {
    public static void main(String[] args) {
        int [] arr={1,2,3,5,7,8,9,10,11,12,14,15,16};
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int target = input.nextInt();
        System.out.println(ceil(arr,target));


    }
    public static int ceil(int []arr , int target){
        int start=0;
        int end = arr.length;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(target < arr[mid]  ){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start = mid +1;

            }
            else{
                return mid;
            }

        }return start;


    }

}
