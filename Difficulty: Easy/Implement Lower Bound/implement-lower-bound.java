class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
       
        int n = arr.length;
        int st = 0;
        int ed = n-1;
        int ans = n;
        
        while(st<=ed){
            int mid = st+ (ed - st)/2;
            
            if(arr[mid]>=target){
                ans = mid;
                ed = mid-1;
                
            }else{
                st = mid +1;
            }
        }
        return ans;
       
        
    }
}
