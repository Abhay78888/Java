package JavaBasics;

import java.util.Arrays;

public class bak {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,5,5};
        int[]arr1=new int[arr.length];
       int index=0;
        for (int i = 0; i <arr.length ; i++) {
            boolean x=false;


            for (int j = 0; j < index; j++) {
                if(arr[i]==arr1[j]){
                    x=true;
                    break;
                }

            }
            if(!x){
                arr1[index]=arr[i];
                index = index + 1;
            }




        }
        

        System.out.println(Arrays.toString(arr1));

    }
}
