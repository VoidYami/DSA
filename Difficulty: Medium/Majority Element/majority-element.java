class Solution {
    int majorityElement(int arr[]) {
        // code here
        int max =0;
        int n = arr.length;
        
       HashMap <Integer , Integer> map = new HashMap<>();
       
       for(int num: arr){
           map.put(num ,map.getOrDefault(num ,0)+1);
           if(map.get(num)>n/2){
               return num;
           }
       }
       return -1;
    }
}