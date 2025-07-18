/*class Node
{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/

// function should return the count of total number of non leaf nodes in the tree.
class Solution {
    int countNonLeafNodes(Node root) {
        // code here
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        
        return countNonLeafNodes(root.left) + countNonLeafNodes(root.right) + 1;
    }
}