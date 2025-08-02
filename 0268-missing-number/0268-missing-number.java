class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
         Arrays.sort(nums);

         int[] temp = new int[n+1];
        
        for(int i =0; i<=n; i++){
           temp[i]=i;
        }

        for(int i =0; i<n; i++){
            if(nums[i]!=temp[i]){
                return temp[i];
            }
        }

      return temp[n];
        
    }
}