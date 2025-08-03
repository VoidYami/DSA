class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int count =0;
       Arrays.sort(nums);

       if(nums[0]==-1){
        return -1;
       }

       for(int i =0; i<n-1; i+=2){
            if(nums[i]!=nums[i+1]){
               return nums[i];
             
            }
        }
       
       return nums[n-1];
        
    }
}