package Leetcode;

public class Leetcode387 {
    public static void main(String[] args) {
        String str = "loveleetcode";
        int [] ch = new int[26];
        for (int i = 0; i <str.length() ; i++) {
            ch[str.charAt(i) -'a']++;

        }
        for (int i = 0; i <str.length() ; i++) {
            if(ch[str.charAt(i)-'a']==1){
                System.out.println(i);
                break;
            }
        }
        System.out.println("-1");
    }
//    public static void main(String[] args) {
//        String str="loveleetcode";
//        int index=-1;
//        for (int i = 0; i <str.length() ; i++) {
//            int count=0;
//            for (int j = 0; j <str.length() ; j++) {
//                if(i!=j && str.charAt(i)==str.charAt(j)){
//                    count++;
//                }
//
//            }
//            if(count ==0){
//                index= i;
//                break;
//
//
//
//            }
//
//
//
//
//        }
//        System.out.println(index);
//    }
}
