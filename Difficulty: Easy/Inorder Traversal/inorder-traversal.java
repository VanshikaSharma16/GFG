/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> al = new ArrayList<>();
        if (root == null) return al;
        
        al.addAll (inOrder (root.left));
        al.add (root.data);
        al.addAll (inOrder (root.right));
        return al;
    }
}