// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // code here
        if (n <= 1) return n;
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
        
        // f(n<=1) return n;
        // else return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
}