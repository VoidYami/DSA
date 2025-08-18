class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        int n = arr.length;
       
        
       HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> repeated = new HashSet<>();
       
       for(int i =0; i<n; i++){
           if(set.contains(arr[i])){
              repeated.add(arr[i]);
           }else{
               set.add(arr[i]);
           }
       }
       for(int i  =0; i<n; i++){
           if(repeated.contains(arr[i]))
           {
               return i+1;
           }
       }
       return -1;
    }
}
