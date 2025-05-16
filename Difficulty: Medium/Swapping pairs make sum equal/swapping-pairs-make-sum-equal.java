//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int[] b = new int[nk.length];
            for (int i = 0; i < nk.length; i++) {
                b[i] = Integer.parseInt(nk[i]);
            }
            Solution sln = new Solution();
            boolean ans = sln.findSwapValues(a, b);
            if (ans) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            // System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean findSwapValues(int[] a, int[] b) {
        // Your code goes here
        int sum1 = 0, sum2 = 0;
        int len1 = a.length, len2 = b.length;
        for (int i: a) {
            sum1 += i;
        }
        for (int i: b) {
            sum2 += i;
        }
        int diff = Math.abs(sum1-sum2);
        
        if (diff == 0) {
            return true;
        } 
        if (diff % 2 == 1) {
            return false;
        }
        
        if (sum1 < sum2) {
            Set<Integer> s = new HashSet<>();
            for (int i: b) {
                s.add(i);
            }
            int adj = diff/2;
            for (int i: a) {
                if (s.contains (i + adj)) {
                    return true;
                }
            }
        } else {
            Set<Integer> s = new HashSet<>();
            for (int i: a) {
                s.add(i);
            }
            int adj = diff/2;
            for (int i: b) {
                if (s.contains (i + adj)) {
                    return true;
                }
            }
        }
        return false;
    }
}
