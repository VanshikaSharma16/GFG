//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int d = Integer.parseInt(in.readLine().trim()); // rotation count (key)
            int n = array.size();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = array.get(i);

            new Solution().rotateArr(arr, d); // rotating the array
            StringBuilder sb = new StringBuilder();

            // printing the elements of the array
            for (int value : arr) sb.append(value).append(" ");
            out.println(sb.toString().trim());

            out.println("~");
        }
        out.flush();
        out.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // static void rotateOne (int arr[]) {
    //     int temp = arr[0];
    //     for (int i = 0; i <= arr.length - 2; i++) {
    //         arr[i] = arr[i + 1];
    //     }
    //     arr[arr.length - 1] = temp;
    // }
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        d = d % n;
        
        if (d == 0) return;
        reverse (arr, 0, d-1);
        reverse (arr, d, n-1);
        reverse (arr, 0, n-1);
    }
    static void reverse (int arr[], int strt, int end) {
        while (strt < end) {
            int temp = arr[strt];
            arr[strt] = arr[end];
            arr[end] = temp;
            strt++;
            end--;
        }
    }
}