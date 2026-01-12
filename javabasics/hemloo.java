package Array_Practice;

public class hemloo {
    public static void main(String[] args) {
        int n = 1234;
        double sum =0;
        int i =0;


        while(n>0){
            int digit = n % 10;
            sum = sum + Math.pow(digit,i);
            n=n/10;
            i=digit;






        }
        System.out.println((int)sum);
    }
}
