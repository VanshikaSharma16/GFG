class Solution {
    // Function to flatten a linked list
    Node flatten(Node root) {
        // code here
        List<Integer> al = new ArrayList<>();
        Node curr = root;
        while (curr != null) {
            Node butt = curr;
            while (butt != null) {
                al.add (butt.data);
                butt = butt.bottom;
            }
            curr = curr.next;
        }
        Collections.sort(al);
        Node dumNode = new Node(0);
        Node cur = dumNode;
        for (Integer e: al) {
            Node newNode = new Node(e);
            cur.bottom = newNode;
            cur = newNode;
        }
        return dumNode.bottom;
    }
}