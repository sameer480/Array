class Solution {
    public void rotate(int[][] matrix) {
        int m= matrix.length;
        int n= matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int t= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int i=0;i<n;i++){
            rev(matrix[i]);
        }
    }
        private void rev(int []row){
            int l=0,r=row.length-1;
            while(l<r){
                int temp=row[l];
                row[l]= row[r];
                row[r]= temp;
                l++;r--;
            }
        }
        
    }
