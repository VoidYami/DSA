class Solution {
    public static void reverse(int [] matrix){
        int i =0 ; int j =matrix.length-1;

        while(i<=j){
            int temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }
    }

    public static void transpose (int [][] matrix){
        int n = matrix.length;
        

        
        for(int i =0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix [j][i] = temp;
            
            }
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        transpose(matrix);

        for(int i =0; i<n; i++){
            reverse(matrix[i]);
        }


        

         
    }
}