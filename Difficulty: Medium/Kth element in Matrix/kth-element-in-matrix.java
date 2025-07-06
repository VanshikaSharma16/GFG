class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                al.add(matrix[i][j]);
            }
        }
        Collections.sort(al);
        return (al.get(k - 1));
    }
}