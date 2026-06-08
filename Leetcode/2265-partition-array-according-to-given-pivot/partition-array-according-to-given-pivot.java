class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater= new ArrayList<>();

        for(int x:nums){
            if(x<pivot){
                less.add(x);
            }
            else if(x>pivot){
                greater.add(x);
            }
            else{
                equal.add(x);
            }
        }
        List<Integer> ans = new ArrayList<>();
        ans.addAll(less);
        ans.addAll(equal);
        ans.addAll(greater);
        int [] answer = new int[ans.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=ans.get(i);
        }
        return answer;

        
    }
}