class Solution {
    public String reverseWords(String s) {
        String [] arr = s.split(" ");
        String a=arr[0];
        int count=0;
        String ans = a;
        for(int i =0;i<a.length();i++){
            char c = a.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }
        for(int i =1;i<arr.length;i++){
            String t = arr[i];
            int temp=0;
            for(int j =0;j<t.length();j++){
                char c = t.charAt(j);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    temp++;
                }
            }
            if(temp==count){
                String rev="";
                for(int j =t.length()-1;j>=0;j--){
                    rev=rev+t.charAt(j);
                }
                ans=ans+" "+rev;
            }
            else{
                ans=ans+" "+t;
            }
        }
        return ans;

        
    }
}