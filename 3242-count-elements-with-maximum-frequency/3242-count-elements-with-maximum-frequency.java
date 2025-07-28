class Solution {
    public int maxFrequencyElements(int[] nums) {
            int total =0;
            int freq =0;
        
            for(int i =0; i<nums.length;i++){
                if(nums[i] == -1) continue;

                int count =0;
                int a = nums[i];

                for(int j =0;j<nums.length;j++){
                    if(nums[j] ==a){
                        count++;
                        nums[j] =-1;
                    }
                }

                if(count > freq){
                    freq = count;
                    total = count;

                }
                else if(count == freq){
                    total += count;
                }
            }
              

        
        
        
        return total;
    
    
    }
}