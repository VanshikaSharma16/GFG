//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends

/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    int getLength (Node head) {
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt += 1;
            temp = temp.next;
        }
        return cnt;
    }
    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        int ln = getLength (head);
        Node temp = head;
        if (ln < k) {
            return -1;
        }
        int target = ln  -  k;
        for (int i = 0; i < target; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
}



//{ Driver Code Starts.

public class GFG {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            if (!input.isEmpty()) {
                String[] numbers = input.split("\\s+");
                for (String num : numbers) {
                    if (!num.isEmpty()) {
                        arr.add(Integer.parseInt(num));
                    }
                }
            }

            int x = Integer.parseInt(br.readLine().trim());

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); ++i) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }

            Solution g = new Solution();
            // System.out.println(k);
            System.out.println(g.getKthFromLast(head, x));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends