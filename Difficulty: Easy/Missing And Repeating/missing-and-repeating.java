class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = arr.length;
        Arrays.sort(arr);
        
        int repeat = -1, missing = -1;
        
        // Step 1: Find repeating
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                repeat = arr[i];
            }
        }
        
        // Step 2: Find missing by checking gaps
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] > 1) {
                missing = arr[i] + 1;
                break;
            }
        }
        
        // Edge case: if missing not found in loop
        if (missing == -1) {
            if (arr[0] != 1) {
                missing = 1;   // if 1 is missing
            } else {
                missing = n;   // if last number is missing
            }
        }
        
        result.add(repeat);
        result.add(missing);
        return result;
    }
}
