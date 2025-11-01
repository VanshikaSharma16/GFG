// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int x: arr) {
            if (x >= 0) {
                pos.add (x);
            } else {
                neg.add (x);
            }
        }
        for (int i = 0; i < pos.size(); i++) {
            arr[i] = pos.get(i);
        }
        for (int i = 0; i < neg.size(); i++) {
            arr[i + pos.size()] = neg.get(i);
        }
    }
}