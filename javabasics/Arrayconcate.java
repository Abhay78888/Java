package Array_Practice;

import java.util.Arrays;

class Arrayconcate {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2 = {6,7,8,9,0};

        int a=arr1.length;
        int b = arr2.length;

        int c = a+b;
        int [] conc = new int[c];

        for (int i =0 ; i <a ; i++){
            conc[i] = arr1[i];

        }
        for (int i =0 ; i<b ; i++){
            conc[a + i]=arr2[i];

        }
        System.out.println(Arrays.toString(conc));

    }
}
