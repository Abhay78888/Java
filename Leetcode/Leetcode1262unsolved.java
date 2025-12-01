package Leetcode;

public class Leetcode1262unsolved {
    public static void main(String[] args) {
        int arr[] = {2,6,2,2,7};
        System.out.print(ch(arr));

    }
    public static int ch(int arr[]) {
       int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 3 == 0) {
            return sum;
        }
        for (int i = 0; i < arr.length; i++) {
            if (sum % 3 == 1 || sum % 3 == 2) {
                if (arr[i] % 3 == 1) {
                    sum -= arr[i];
                } else if (sum % 3 == 2) {
                    sum -= arr[i];
                }
            }

        }
        return sum;
    }

    }
