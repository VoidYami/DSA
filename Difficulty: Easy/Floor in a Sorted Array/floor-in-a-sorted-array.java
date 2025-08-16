class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int st =0;
       
        int end = arr.length-1;
        int ans = -1;
        
        while(st<=end){
            int mid= (st+end)/2;
            
           if(arr[mid]==x){
               ans = mid;
               st=mid+1;
           }else if(arr[mid]<x){
               ans = mid;
               st = mid+1;
           }else{
               end = mid-1;
           }
        }
        return ans;
    }
}
