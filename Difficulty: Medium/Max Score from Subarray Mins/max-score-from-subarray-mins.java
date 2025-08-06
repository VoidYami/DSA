class Solution {
    public int maxSum(int arr[]) {
        // code here
        int current = 0;
        int max_sum = arr[0];
        
        for(int i =0; i<arr.length-1; i++){
           current = arr[i]+arr[i+1];
           
           if(current>max_sum){
               max_sum = current;
           }
          }
          return max_sum;
    }
}