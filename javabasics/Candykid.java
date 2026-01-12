
package Array_Practice;

import java.util.Arrays;

public class Candykid {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extra = 3;
        boolean[] result = new boolean[candies.length];
        int max=0;
        for (int i =0 ; i<candies.length ; i++){
            if (max<candies[i]){
                max = candies[i];

            }


        }
        System.out.println(max);
        for (int i =0 ; i < candies.length ; i++ ){
            if(candies[i]+ extra >=max){
                result[i]=true;
            }
            else{
                result[i]=false;
            }
        }
        System.out.println(Arrays.toString(result));
    }

}
