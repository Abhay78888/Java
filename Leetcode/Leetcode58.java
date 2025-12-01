package Leetcode;

import java.util.Arrays;

public class Leetcode58 {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        String[] ans = s.split(" ");
        System.out.println(Arrays.toString(ans));
        int n = ans.length;
        int annswer=ans[n-1].length();
        System.out.println(annswer);


    }
}
