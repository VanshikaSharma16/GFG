/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static int getSize(Node node) {
        // code here
        if (node == null) return 0;
        
        int l = getSize(node.left);
        int r = getSize(node.right);
        return l + r + 1;
    }
}