package Leetcode;

import java.util.Arrays;

public class Leetcode832 {
    public static void main(String[] args) {
        int [][] arr =  {{1,1,0},{1,0,1},{0,0,0}};
        int [][] reverse =new int[3][3];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                reverse[i][j]=arr[i][arr[i].length - 1 -j];





            }

        }
        int [][] flip = new int [3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(reverse[i][j]==0){
                    flip[i][j]=1;


                }
                else{
                    flip[i][j]=0;
                }

            }

        }
        System.out.println(Arrays.deepToString(flip));



    }
}
