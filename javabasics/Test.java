package JavaBasics;//Write a program to find the total of only JavaBasics.odd numbers in an Array_Practice.JavaBasics.array
////inputArray[5] = {1,2,3,4,5}
//output= 9



import java.util.Arrays;
import java.util.Scanner;
public class Test {
   static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        array();

//        int[] arr ={1,2,3,4,5};


//     sum(1,3);
//     multiply(9999,9999);
//     JavaBasics.divide(1,90);
//        System.out.println(JavaBasics.divide(3, 8));



    }
    public static void array(){
        int n = input.nextInt();
        int arr[]=new int[n];
        for(int i =0 ; i < n; i++){
            arr[i]=input.nextInt();

        }
        for(int i =0 ; i < n; i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));



    }

//    static int oddsum(){
//
//    }

    public static void sum(int a , int b){  //parameterized non returning method
        int sum = a+b;
        System.out.println(sum);

    }
    public static void multiply(int a , int b){
        int answer = a*b;
        System.out.println(answer);


    }
    public static int divide(int a,int b){
        sum(2,4);
        int answer=a/b;
//        System.out.println(answer);
        multiply(1,2);

        return  answer;

    }



}
