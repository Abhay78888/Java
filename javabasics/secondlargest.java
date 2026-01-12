package JavaBasics;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};
        int max=0;
        int max1=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }


        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max1 && arr[i]!=max){
                max1=arr[i];
            }

        }
        System.out.println(max1);
    }
}
