package Array_Practice;

public class Cyclic_missingnumber {
    public static void main(String[] args) {
        int [] arr = {0,1,2,4};
        sort(arr);
        int temp=arr.length;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=i){
                temp=i;
                break;

            }

        }
        System.out.println((temp));



    }

    public static void sort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

    }

    public static void swap(int[] arr,int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;




    }

}