//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String st = sc.next();

            char ans = new Solution().nonRepeatingChar(st);

            if (ans != '$')
                System.out.println(ans);
            else
                System.out.println(-1);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        
        StringBuilder num = new StringBuilder();
       
        for(int i =0; i<s.length(); i++){
            char temp = s.charAt(i);
            boolean x = true;
            for(int j =0; j<s.length(); j++){
                if(i !=j && s.charAt(j) == temp){
                    x = false;
                    break;
                }
            }
            if (x){
                num.append(temp);
            }
        }
        return num.length() > 0 ? num.charAt(0) : '$';
    }
}
