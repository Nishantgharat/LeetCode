class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int i=0;
        int [] ar=new int [m*n];
        int row=0;
        int col=0;
        boolean up=true;
        while(row<m && col<n){
            if(up){
                while(row>0 && col<n-1){
                    ar[i++]=mat[row][col];
                    col++;
                    row--;
                }
                ar[i++]=mat[row][col];
                if(col==n-1){
                    row++;
                }
                else{
                    col++;
                }
                
                
            }
            else{
                while(col>0 && row<m-1){
                    ar[i++]=mat[row][col];
                    col--;
                    row++;
                }
                ar[i++]=mat[row][col];
                if(row==m-1){
                    col++;
                }
                else{
                    row++;
                }
                
            }
            up=!up;
            
        }
        
        return ar;
        
        
    }
}
