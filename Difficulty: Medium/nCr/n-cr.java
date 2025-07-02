class Solution {
    public int nCr(int n, int r) {
        // code here
        if (r > n || r < 0) return 0;
        
        r = Math.min (r, n - r);
        long res = 1;
        
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int)res;
    }
}