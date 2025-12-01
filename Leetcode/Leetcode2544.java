package Leetcode;

public class Leetcode2544 {
    public static void main(String[] args) {
        int n = 886996;
        int count =0;
        int sum =0;
        String str = Integer.toString(n);
        StringBuilder stringBuilder = new StringBuilder(str);
        String reversedString = stringBuilder.reverse().toString();
        int n1=Integer.parseInt(reversedString);


        while(n1>0){
            if(count%2==0){
                int temp = n1 % 10;
                sum = sum + temp;
                n1=n1/10;
                count++;

            }
            else{
                int temp = n1 % 10;
                sum = sum - temp;
                n1=n1/10;
                count++;

            }

        }
        System.out.println(sum);

    }
}
