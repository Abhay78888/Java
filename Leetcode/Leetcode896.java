package Leetcode;

public class Leetcode896 {
    public static void main(String[] args) {
        int [] arr={1,2,2,3};
        boolean inc=true;
        boolean dec=true;
        for (int i = 0; i <arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                dec=false;
            }
            else if(arr[i]>arr[i+1]){
                inc=false;


            }




        }
        System.out.println(inc||dec);
    }
}
