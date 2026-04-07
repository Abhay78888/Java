class Solution {
    public List<Long> mergeAdjacent(int[] arr) {
        Stack <Long> st = new Stack <>();
        for(int i = 0 ; i<arr.length;i++){
            long curr = arr[i];

        while(!st.isEmpty() && st.peek()==curr){
            curr+=st.pop();
        }
        st.push(curr);
        
    }
        return new ArrayList<>(st);


        
    }
}