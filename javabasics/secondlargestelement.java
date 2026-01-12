package Array_Practice;

public class secondlargestelement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int max1=0;
        int max2=0;
        for (int i =0; i <arr.length ; i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
        }
        System.out.println(max2);
        //for(int i =0 ; i<arr.length ; i++){
        //    if(arr[i]>max2 && max2!=max1){
        //        max2=arr[i];
        //    }
        //}
        //System.out.println(max2);
    }
}
