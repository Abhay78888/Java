class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n =matrix[0].length;
        ArrayList<Integer> answer = new ArrayList<>();


        int srow=0,erow=m-1,scol=0,ecol=n-1;
        while(srow<=erow && scol<=ecol){
            for(int j=scol;j<=ecol;j++){
                answer.add(matrix[srow][j]);


            }
            for(int i=srow+1;i<=erow;i++){
                
                answer.add(matrix[i][ecol]);
            }
            for(int j=ecol-1;j>=scol;j--){
                if(srow==erow){
                    break;
                }
                answer.add(matrix[erow][j]);
        }
            for(int i=erow-1;i>=srow+1;i--){
                if(scol==ecol){
                    break;
                }
                answer.add(matrix[i][scol]);

            }
            srow++;erow--;scol++;ecol--;
        }
        return answer;
        
    }
}