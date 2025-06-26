class Solution {
    public ArrayList<Integer> printDivisors(int n) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for (int i  = 1; i <= n; i++) {
             if (n % i == 0) {
                 al.add(i);
             }
        }
        return al;
    }
}