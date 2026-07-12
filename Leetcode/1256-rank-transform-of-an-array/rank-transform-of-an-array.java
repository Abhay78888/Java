class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] sorted = arr.clone();
        Arrays.sort(sorted);

        int rank=1;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:sorted){
            if(!map.containsKey(x)){
                map.put(x,rank);
                rank++;

            }
        }
        int [] ans = new int[arr.length];
        for(int i =0;i<ans.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;


        
    }
}