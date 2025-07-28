class Solution {
    public int findClosestNumber(int[] nums) {
        int near =nums[0];
        int min_diff = Math.abs(nums[0]);
        for(int i =0;i<nums.length;i++){
            int currentDistance = Math.abs(nums[i]);

            if(currentDistance < min_diff){
                min_diff = currentDistance;
                near = nums[i];
            }else if(currentDistance == min_diff && nums[i] >near){
                near = nums[i];
            }
           

        }
         return near;
    }
}