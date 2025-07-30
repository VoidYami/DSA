class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashSet<Integer> once = new HashSet<>();
          HashSet<Integer> repeated = new HashSet<>();
        
        for(int num : arr){
            if(!once.add(num)){
                repeated.add(num);
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>(repeated);
       
        Collections.sort(result);
        return result;
    }
}