class Solution {
    public int search(int[] nums, int target) {
        int start =0;
        int n = nums.length;
        int end = n-1;
        int count =0;
        int pos = 0;
        

        for(int i=0; i<n-1; i++){
          if(nums[i]>nums[i+1]){
            count++;
            pos = i+1;
          }
        }
       if (count == 0) pos = 0;

      
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = nums[(i + pos) % n];
        }

        while(start<=end){
          int mid = start + (end-start)/2;

          if(temp[mid]==target){
            return (mid+pos)%n;
          }else if(temp[mid]<target){
            start = mid +1;
          }else{
            end = mid-1;
          }
        }
        return -1;
    }
}