//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java
import java.math.BigInteger;

class Solution {
    public static ArrayList<Integer> factorial(int n) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        
        String str= fact.toString();
       
        for (int i = 0; i < str.length(); i++) {
            al.add(Character.getNumericValue(str.charAt(i)));
        }
       
        return al;
    }
}


//{ Driver Code Starts.

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends