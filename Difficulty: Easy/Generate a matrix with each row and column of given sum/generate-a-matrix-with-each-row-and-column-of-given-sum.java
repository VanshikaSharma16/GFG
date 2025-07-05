// User function Template for Java
class Solution {
 public int[][] generateMatrix(int[] rowSum, int[] colSum) {
        // code here
        int n=rowSum.length;
        int m=colSum.length;
       int mat[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int value=Math.min(rowSum[i],colSum[j]);
                mat[i][j]=value;
                rowSum[i]-=value;
                colSum[j]-=value;
            }
        }
        return mat;
    }
}

