class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        int[] temp = new int[n];
        int idx =0;
        
       for(String op : operations){
        if(op.equals("C")){
            idx--;
        } else if(op.equals("D")){
            temp[idx]= 2 * temp[idx-1];
            idx++;
        }else if(op.equals("+")){
            temp[idx]= temp[idx-1] + temp[idx-2];
            idx++;
        }else{
            temp[idx]= Integer.parseInt(op);
            idx++;
        }
       }

       int sum =0;
       for(int i =0; i<idx; i++){
        sum += temp[i];
       }
       return sum;
    }
}