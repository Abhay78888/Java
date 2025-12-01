package Leetcode;

public class Leetcode125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama.";
        StringBuilder newStr = new StringBuilder();
        StringBuilder newStr2= new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                newStr.append(Character.toLowerCase(ch));
            }
        }
        for (int i = newStr.length()-1; i>=0 ; i--) {
            char ch = newStr.charAt(i);
            newStr2.append(ch);

        }
        System.out.println(newStr.toString().equals(newStr2.toString()));

        System.out.println(newStr.toString());

    }

    public static class Leetcode1732 {
        public static void main(String[] args) {
            int [] arr ={-4,-3,-2,-1,4,3,2};
            int sum = 0;
            int max =0;

            for (int i = 0; i < arr.length ; i++) {
                sum = sum + arr[i];
                max = Math.max(sum,max);




            }
            System.out.println(max);
        }
    }
}
