class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int st =0;
        int end = nums.length-1;


        while(st<=end){
            if(nums[st]%2!=0 && nums[end]%2==0){
                int temp = nums[st];
                nums[st]=nums[end];
                nums[end] = temp;
                st++;
                end--;
            }else if(nums[st]%2==0){
                st++;
            }else{
                end--;
            }
        }

      return nums;
    }
}