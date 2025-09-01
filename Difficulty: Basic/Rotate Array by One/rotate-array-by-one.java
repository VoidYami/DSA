// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
     List<Integer> list = new ArrayList<>();
      for (int num : arr) {
            list.add(num);
        }
     
     Collections.rotate(list ,1);
     
       for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        
    }
}