class Solution {
    
    void merge(int arr[], int l, int mid, int r){
        int[] merged = new int[r-l+1];
        
        int x = l;
        int y = mid+1;
        
        int merged_idx = 0;
        
        while(x<=mid && y <=r){
            if(arr[x]<=arr[y]){
                merged[merged_idx] = arr[x++];
                merged_idx++;
            }else{
                merged[merged_idx++] = arr[y++];
            }
        }
        while(x<=mid){
            merged[merged_idx++] = arr[x++];
        }
        
        while(y <=r){
            merged[merged_idx++] = arr[y++];
        }
        for(int i = 0, j = l; i < merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r){
            return;
        }
        int mid = (l+r)/2;
        
        mergeSort(arr , l ,mid);
        mergeSort(arr , mid+1 ,r);
        merge(arr , l ,mid , r);
        
    }
}