// User function Template for Java

class Solution {
    public boolean isPalindrome(int n) {
        // Code here
        int store = n;
        int x = 0;
        while (store != 0) {
            int rem = store % 10;
            x = x * 10 + rem;
            store = store / 10;
        }
        if (x == n) {
            return true;
        } return false;
    }
}