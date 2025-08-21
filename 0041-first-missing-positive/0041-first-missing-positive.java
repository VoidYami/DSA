class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int smallest = 1;
      

        Arrays.sort(nums);

        for(int num: nums){
            if(num==smallest){
                smallest++;
            }
        }
        return smallest;
       
       
    }
}