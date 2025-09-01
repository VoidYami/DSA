// User function Template for Java

class Solution {
    public void Addition(int[][] matrixA, int[][] matrixB) {
        int cols = matrixA.length;
        int row = matrixA[0].length;
        
       
        // code here
        for(int i=0; i<cols; i++){
            for(int j =0; j<row; j++){
                matrixA[i][j] = matrixA[i][j] + matrixB[i][j];
                
            }
            
        }
        return;
        
    }
}