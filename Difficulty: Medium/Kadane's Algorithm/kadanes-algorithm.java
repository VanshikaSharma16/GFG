//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.maxSubarraySum(arr));
        }
    }
}

// } Driver Code Ends


class Solution {

    // Function to find the sum of the contiguous subarray with the maximum sum.
    long maxSubarraySum(int[] arr) {
        
        // Initialize variables
        long maxi = Long.MIN_VALUE; // Set maxi to the smallest possible value of long
        long prefix = 0;

        // Iterate over the array
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i]; // Add current element to prefix sum
            maxi = Math.max(prefix, maxi); // Update maxi with the maximum of prefix and maxi

            // Reset prefix if it's less than 0
            if (prefix < 0)
                prefix = 0;
        }

        return maxi; // Return the maximum sum found
    }
}