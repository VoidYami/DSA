class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n =nums.length;
        Arrays.sort(nums);
        long total = 0;
        int maxFreq = 0;
        int left =0;
        
        for(int i =0; i<n;i++){
                total +=nums[i];

          while((long)nums[i]* (i - left+1)- total >k){
                    total -= nums[left];
                    left++;
            }
            maxFreq = Math.max(maxFreq, i-left+1);
        }
        return maxFreq;
    }
}