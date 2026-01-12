package JavaBasics;

public class odd {
    public static void main(String[] args) {
        int sum = 0;
        int arr[]={1,2,3,4,5};
        for (int i =0 ; i<5 ; i++){
            if (arr[i]%2!=0){
                sum = sum + arr[i];;
            }

        }
        System.out.println(sum);
    }
}
