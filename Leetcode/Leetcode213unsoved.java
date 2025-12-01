package Leetcode;

public class Leetcode213unsoved {
    public static void main(String[] args) {
        int [] arr={2,3,2};
        if(arr.length==1){
            System.out.println(arr[0]);
        }
        if(arr.length==2){
            System.out.println(Math.max(arr[0],arr[1]));
        }
        int max=0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }



        }

        int odd=0;
        for (int i = 0; i <arr.length ; i=i+2) {
            odd=odd+arr[i];



        }
        int even=0;
        for (int i = 1; i < arr.length ; i=i+2) {
            even=even+arr[i];

        }
        int max2=Math.max(even,odd);
        if(max>max2){
            System.out.println(max);

        }
        else{
            System.out.println(max2);
        }

    }
}
