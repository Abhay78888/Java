package Array_Practice;

public class Goodpairs {
    public static void main(String[] args) {
        int [] arr={1,2,3,1,1,3};
        int pairs=0;
        for(int i =0 ; i<arr.length ; i++){
            for (int j =i ; j<arr.length ; j++){
                if(arr[i] == arr[j] && i<j){
                    pairs++;
                }
            }

        }
        System.out.println(pairs);
    }
}
