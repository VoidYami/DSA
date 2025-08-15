class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;
       Arrays.sort(arr);
      
        
        for(int i =0;i<n;i++){
            if(i+1!=arr[i]){
                return i+1;
            }
        }
        return n+1;
    }
}