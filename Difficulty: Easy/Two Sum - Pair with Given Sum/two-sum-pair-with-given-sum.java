//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            // int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[0]);

            String line = br.readLine();
            String[] tokens = line.split(" ");
            int[] arr = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            boolean ans = new Solution().twoSum(arr, x);
            System.out.println(ans ? "true" : "false");
            // System.out.println("~");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to check if there exists a pair that sums up to the target
    boolean twoSum(int arr[], int target) {
        // HashMap to store array elements and their indices
        HashMap<Integer, Integer> seen = new HashMap<>();
        
        // Traverse through the array
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];  // Calculate the complement
            
            // If the complement is already in the map, return true
            if (seen.containsKey(complement)) {
                return true;
            }
            
            // Otherwise, store the current element in the map
            seen.put(arr[i], i);
        }
        
        // If no pair found, return false
        return false;
    }
}