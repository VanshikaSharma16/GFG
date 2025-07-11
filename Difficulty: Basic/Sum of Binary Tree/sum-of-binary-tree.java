/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    // Function to return sum of all nodes of a binary tree
    static int sumBT(Node root) {
        if (root == null) return 0;
        // Your code here
        int sum = root.data;
        if (root.left != null) {
            sum += sumBT(root.left);
        }
        if (root.right != null) {
            sum += sumBT(root.right);
        }
        return sum;
    }
}