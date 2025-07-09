// User function Template for Java

class Solution {
    int countZeroes(int[] arr) {
        // code here
        int cnt = 0;
        for (int x: arr) {
            if (x == 0){
                cnt++;
            }
        }
        return cnt;
    }
}
