class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultset = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            if(set1.contains(num)){
                resultset.add(num);
            }
        }
        int i= 0;
        int[] result = new int[resultset.size()];
        for(int num : resultset){
            result[i++]=num;
        }
        return result;
       
    }
}