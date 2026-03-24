class Solution {
    public int maximum69Number (int num) {
        String n = Integer.toString(num);
        char[] arr= n.toCharArray();
        for(int i =0;i<arr.length;i++){
            if(arr[i]=='6'){
                arr[i]='9';
                break;
            }
        }
        String result = new String(arr);
        int number = Integer.parseInt(result);
        return number;
       
        
    }
}