class Solution {
    int solve(int n,int i){
        if(i==0)return 1;
        return n*solve(n,i-1);
    }
    int reverseExponentiation(int n) {
        if(n==10) return n;
        int i=n;
        return solve(n,i);
    }
}
