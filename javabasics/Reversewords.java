package JavaBasics;

public class Reversewords {
    public static void main(String[] args) {
        String str="Abhay is fuckboi";
        String[] words= str.split(" ");
        for (int i = 0; i < words.length ; i++) {
            String word=words[i];
            String reversed="";

            for (int j = word.length()-1; j >=0 ; j--) {
                reversed=reversed + word.charAt(j);

            }
            System.out.print(reversed + " ");





        }





    }
}
