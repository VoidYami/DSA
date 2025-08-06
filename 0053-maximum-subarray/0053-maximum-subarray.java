// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max_sum = nums[0];
//         int current = nums[0];

//         for(int i =1; i<nums.length; i++){
//             current = Math.max(nums[i] , current+nums[i]);

//             max_sum = Math.max(max_sum , current);
//         }

     
//         return max_sum;
        
//     }
// }

class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int current = 0;

        for(int i =0; i<nums.length; i++){
            current += nums[i];

            max_sum = Math.max(max_sum , current);
            if(current <0){
                current =0;
            }
        }

     
        return max_sum;
        
    }
}