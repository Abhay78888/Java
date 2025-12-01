package Leetcode;

public class Leetcode242 {
    public static void main(String[] args) {
        String s="rat";
        String t = "car";
        if(s.length()!=t.length()){
            System.out.println("false");
        }
        char[] arr=t.toCharArray();
        int count = 0;
        for (int i = 0; i <s.length() ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(s.charAt(i)==arr[j]){
                    arr[j]='*';
                    count++;
                    break;

                }
                
            }

        }
        if(count == s.length()){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
