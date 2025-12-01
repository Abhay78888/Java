package Leetcode;
import java.util.ArrayList;

public class leetcode682 {
    public static void main(String[] args) {
        String [] arr={"5","2","C","D","+"};
        ArrayList<Integer> myIntegerList = new ArrayList<>();
        int sum =0;

        for (int i = 0; i < arr.length ; i++) {
            if(!arr[i].equals("C") && !arr[i].equals("D") && !arr[i].equals("+")){
                myIntegerList.add(Integer.parseInt(arr[i]));
            } else if(arr[i].equals("C")){
                myIntegerList.remove(myIntegerList.size()-1);
            }
            else if(arr[i].equals("D")){
                int last = myIntegerList.get(myIntegerList.size()-1);
                myIntegerList.add(last*2);
            }
            else if(arr[i].equals("+")){
                int last = myIntegerList.get(myIntegerList.size()-1);
                int slast = myIntegerList.get(myIntegerList.size()-2);
                myIntegerList.add(last+slast);
            }





        }
        for (int number : myIntegerList) {
            sum += number;
        }

        System.out.println(sum);



    }
}
