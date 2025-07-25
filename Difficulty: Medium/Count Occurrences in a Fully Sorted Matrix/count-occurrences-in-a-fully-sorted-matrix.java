class Solution {
    public int countOccurrences(int[][] mat, int x) {
        // code here
        int cnt = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
