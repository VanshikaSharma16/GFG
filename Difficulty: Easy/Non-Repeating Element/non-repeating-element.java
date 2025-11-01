// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
        int n = arr.length;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int x: arr) {
            hs.put (x, hs.getOrDefault (x, 0) + 1);
        }
        for (int num: arr) {
            if (hs.get(num) == 1) {
                return num;
            }
        }
        return 0; 
    }
}
