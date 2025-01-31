//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends

                                                
// User function Template for Java

class Solution {
    String removeDups(String s) {
        // Use LinkedHashSet to store characters in order while removing duplicates
        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        
        for (char c : s.toCharArray()) {
            seen.add(c);  // Adds only unique characters while preserving order
        }

        // Convert LinkedHashSet back to a string
        StringBuilder result = new StringBuilder();
        for (char c : seen) {
            result.append(c);
        }

        return result.toString();
    }
}