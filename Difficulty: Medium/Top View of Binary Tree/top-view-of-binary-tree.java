/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    static void solve(Node root, int h, int l, TreeMap<Integer, int[]> map) {
        if (root == null) return;
        
        if (!map.containsKey(h) || map.get(h)[1] > l) {
            map.put(h, new int[]{root.data, l});
        }
        
        solve(root.left, h - 1, l + 1, map);
        solve(root.right, h + 1, l + 1, map);
    }
    
    static ArrayList<Integer> topView(Node root) {
        TreeMap<Integer, int[]> map = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        if (root == null) return ans;
        
        solve(root, 0, 0, map);
        
        for (int[] val : map.values()) {
            ans.add(val[0]);
        }
        
        return ans;
    }
}