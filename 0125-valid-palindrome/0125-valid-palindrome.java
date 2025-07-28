class Solution {
    public boolean isPalindrome(String s) {

         String ori = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        String reverse = new StringBuilder(ori).reverse().toString();

        if (ori.equals(reverse)){
            return true;
        } else {
            return false;
        }
        
        
    }
}