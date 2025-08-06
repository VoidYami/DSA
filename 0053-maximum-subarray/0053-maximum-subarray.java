class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int current = nums[0];

        for(int i =1; i<nums.length; i++){
            current = Math.max(nums[i] , current+nums[i]);

            max_sum = Math.max(max_sum , current);
        }

     
        return max_sum;
        
    }
}