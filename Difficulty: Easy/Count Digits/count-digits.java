// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count = 0;
        int orignal = n;
        while(n>0){
            int temp = n % 10;
            n = n/10;
            if(temp!=0 && orignal%temp==0){
              
                count++;
            }
            
            
        }
        return count;
        
    }
}