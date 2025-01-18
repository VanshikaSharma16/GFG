//{ Driver Code Starts


import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine()); // Read number of test cases

        while (t-- > 0) {
            int n =
                Integer.parseInt(read.readLine()); // Read the number to check primality
            Solution ob = new Solution();
            if (ob.isPrime(n)) {
                System.out.println("true"); // If the number is prime, print "true"
            } else {
                System.out.println(
                    "false"); // If the number is not prime, print "false"
            }
            System.out.println("~"); // If the number is not prime, print "false"
        }
    }
}

// } Driver Code Ends


class Solution {
    public static boolean isPrime(int n) {
        // A number less than or equal to 1 is not prime
        if (n <= 1) {
            return false;
        }
        // Check divisors up to the square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Not prime if divisible by i
            }
        }
        return true; // Prime if no divisors found
    }
}