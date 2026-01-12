package JavaBasics;

public class Prime2brute {
    public static void main(String[] args) {
        int n =29;
        boolean isprime=true;
        for (int i =2; i <n; i++){
            if(n%i==0){
                isprime=false;
                break;

            }
        }
        if(isprime==true){
            System.out.println("prime");

        }
        else{
            System.out.println("not prime");
        }


    }
}
