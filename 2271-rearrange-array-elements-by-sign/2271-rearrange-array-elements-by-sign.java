class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;
        int[] temp = new int[n / 2];   
        int[] temp1 = new int[n / 2];  

        int pIdx = 0;
        int nIdx = 0;

       
        for (int num : nums) {
            if (num > 0) {
                temp[pIdx++] = num;
            } else {
                temp1[nIdx++] = num;
            }
        }

        int[] ans = new int[n];
        int i = 0, p = 0, ne = 0;

        
        while (p < n / 2 && ne < n / 2) {
            ans[i++] = temp[p++];
            ans[i++] = temp1[ne++];
        }

        return ans;
    }
}
