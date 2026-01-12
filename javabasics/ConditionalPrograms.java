package JavaBasics;

import java.util.Scanner;
public class ConditionalPrograms {
    public static void main(String[] args) {
        checkLeapYear(2024);
        ArmstrongNumber(153);

    }

    public static void Hcf_lcm(){


    }

    public static void reverseAString(){

    }
    public static void Power(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();




    }
    public static void checkLeapYear(int n){
        Scanner input = new Scanner (System.in);
        int year=input.nextInt();
        if((year%4==0 && year%100!=0) || year %400==0){
            System.out.println("Leap Year");

        }
        else{
            System.out.println("not a leap year");
        }

    }
    public static void ArmstrongNumber(int n){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int rem = 0;
        int temp=num;
        while(num>0){
            rem = rem + temp%10;
            temp=temp/10;
        }
        if(num==rem){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not a armstrong number");
        }

    }
    public static void findVowelInAString(){
        Scanner input = new Scanner(System.in);
        char word = input.next().charAt(0);
        if (word =='A' || word =='E' || word =='I' || word =='I' || word =='O' || word =='U' || word =='a' || word =='e' || word =='i' || word =='o' || word =='u'){
            System.out.println("vowels");

        }
        else{
            System.out.println("not a vowel");
        }


    }

//    Kunal is allowed to go out with his friends only on the even days
//    of a given month. Write a program to count the number of days he
//    can go out in the month of August.
     public static void count(){
        int num = 31;
        int days =0;
        for (int i =1 ; i<32 ; i++){
            if(i%2==0){
                days = days + 1;

            }
            System.out.println(days);

        }

     }

//    Write a program to print the sum of negative numbers,
//    sum of positive even numbers and the sum of positive JavaBasics.odd numbers
//    from a list of numbers (N) entered by the user.
//    The list terminates when the user enters a zero.

    public static void sum(){

    }


}
