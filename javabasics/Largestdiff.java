package JavaBasics;

public class Largestdiff {
    public static void main(String[] args) {
        int[] arr={1,5,7,3,9,6};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

        }

        int maxdiff=max-min;
        System.out.println(maxdiff);

    }
}
