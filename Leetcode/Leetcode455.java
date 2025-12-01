package Leetcode;

public class Leetcode455 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int [] cookies={1,1};

        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <cookies.length ; j++) {
                if(cookies[j]>=arr[i]){
                    count++;
                    break;

                }

            }

        }
        System.out.println(count);
    }
}
