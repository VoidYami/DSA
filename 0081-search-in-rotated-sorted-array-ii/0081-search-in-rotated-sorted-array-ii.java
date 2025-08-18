class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length; 

      Arrays.sort(nums);

      int st =0;
      int end =n-1;
      boolean ans = false;

      while(st<=end){
        int mid = st + (end-st)/2;

        if(nums[mid]==target){
            ans = true;
            end = mid-1;
        }else if (nums[mid]<target){
            st = mid +1;
        }else{
            end = mid-1;
        }
      }
      return ans;
        
    }
}