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
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        leftViewDFS (root, 0, ans);
        return ans;
    }
    public void leftViewDFS (Node root, int level, ArrayList<Integer> ans) {
        if (root == null) return;
        
        if (level == ans.size()) {
            ans.add(root.data);
        }
        
        leftViewDFS (root.left, level+1, ans);
        leftViewDFS (root.right, level+1, ans);
    }
}