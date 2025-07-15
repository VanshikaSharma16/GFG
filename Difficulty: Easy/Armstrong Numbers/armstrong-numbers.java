// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int x = 0;
        int store = n;
        int len = String.valueOf(n).length();
        
        while (n != 0) {
            int rem = n % 10;
            x += Math.pow (rem, len);
            n = n / 10;
        }
        return x == store;
    }
}