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
                array.add(Integer.parseInt(
                    token)); // Use Integer.parseInt to parse int values
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            Solution obj = new Solution();

            // calling equilibriumPoint() function
            System.out.println(obj.equilibriumPoint(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(int arr[]) {
        // code here
        int ln = arr.length;
        int lsum = 0, tsum = 0;
        if (ln == 0) {
            return -1;
        }
        for (int i = 0; i < ln; i++) {
            tsum+=arr[i];
        }
        
        for(int i = 0; i < ln; i++) {
            tsum -= arr[i];
            if (tsum == lsum) {
                return i+1;
            }
            lsum += arr[i];
        }
        return -1;
    }
}
