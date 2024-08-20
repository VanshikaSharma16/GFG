//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends

class Solution {
    // Method to calculate factorial
    static long factorial(long x) {
        if (x == 0) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();
        for (int i = 1; ; i++) {
            long fact = factorial(i);
            if (fact > n) {
                break;
            }
            result.add(fact);
        }
        return result;
    }
}
