class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();
       

        int [][] temp = new int [numRows][numRows];

        for(int i=0; i<numRows; i++){
            temp[i][0] = 1;
            temp[i][i] =1;

           for (int j = 1; j < i; j++) {
                temp[i][j] = temp[i - 1][j - 1] + temp[i - 1][j];
            }

        }
        for(int i =0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                row.add(temp[i][j]);
            }
            list.add(row);
        }
        return list;
        
    }
}