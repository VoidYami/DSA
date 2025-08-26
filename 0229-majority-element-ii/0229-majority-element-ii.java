class Solution {
    public List<Integer> majorityElement(int[] nums) {
       
        HashMap <Integer , Integer> map = new HashMap<>();
        int n = nums.length;

        for(int num : nums){
            map.put( num ,map.getOrDefault(num , 0)+1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int num : map.keySet()){
            if(map.get(num) > n/3){
                result.add(num);
            }
        }
        return result;

    }   

}