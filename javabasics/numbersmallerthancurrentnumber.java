package Array_Practice;

import java.util.Arrays;

public class numbersmallerthancurrentnumber
{
    public static void main(String[] args) {
        int [] arr = {8,1,2,2,3};
        int[] result=new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            int count = 0;
            for(int j =0 ; j <arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;

                }
            }
            result[i]=count;
        }
        System.out.println(Arrays.toString(result));
    }
}
