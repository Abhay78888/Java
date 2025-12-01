package Leetcode;

public class Leetcode747 {
    public static void main(String[] args) {
        int [] arr ={3,6,1,0};
        int max = arr[0];
        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
                index=i;

            }

        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]*2>max){
                System.out.println("-1");
                break;
            }
            else{
                System.out.println(index);
                break;

            }


        }
    }
}
