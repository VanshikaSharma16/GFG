class Solution {
    public int findMax1sRow(int[][] mat) {
        // code here
        int temp1=0, temp2;
        int row = 0;
        for (int i = 0; i < mat.length; i++) {
            temp2 = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    temp2+=1;
                }
            }
            if (temp1 < temp2) {
                temp1 = temp2;
                row = i;
            }
        }
        return row;
    }
}