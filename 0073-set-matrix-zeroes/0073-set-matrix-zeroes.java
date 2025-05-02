class Solution {
    public void setZeroes(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;
        Set<Integer> row = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    cols.add(j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row.contains(i)|| cols.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }

        
    }
}