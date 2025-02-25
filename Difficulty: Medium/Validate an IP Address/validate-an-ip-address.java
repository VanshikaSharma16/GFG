//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static boolean inRange(int n) {
        if (n >= 0 && n <= 255) {
            return true;
        }
        return false;
    }
 
    public static boolean hasLeadingZero(String n) {
        if (n.length() > 1) {
            if (n.charAt(0) == '0') {
                return true;
            }
        }
        return false;
    }

    public boolean isValid(String s) {
        // Write your code here
        String[] parts = s.split("\\.");
        if (parts.length != 4) {
            return false;
        }
        for (String part : parts) {
            if (hasLeadingZero(part)) {
                return false;
            } 
            if (part.length() == 0) {
                return false;
            }
            try {
                int num = Integer.parseInt(part);
                if (!inRange(num)) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}