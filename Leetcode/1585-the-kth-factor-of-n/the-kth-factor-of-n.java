class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans.add(i);
            }
        }
        if(k>ans.size()){
            return -1;
        }
        int answer=ans.get(k-1);
        return answer; 
        
    }
}