class Solution {
    public void rotate(int[] nums, int k) {
          int n = nums.length;
          int d = k%n;
          int[] temp = new int[n];

          for (int i = 0; i < d; i++) {
            temp[i] = nums[n - d + i];
        }

          for(int i=d;i<n;i++){
            temp[i] = nums[i-d];
          }
          
         for(int i =0;i<n;i++){
            nums[i]=temp[i];
         }
        
    }
}