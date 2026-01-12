package Array_Practice;

public class Unsortedmax {
    public static void main(String[] args) {
        int [] arr = {1,2,4,3,200};
        int max=0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        int max2=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }


        }
        System.out.println(max);
        System.out.println(max2);
    }
}
