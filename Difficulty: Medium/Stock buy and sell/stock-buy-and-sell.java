//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    // Function to find the days of buying and selling stock for max profit.
    int stockBuySell(int arr[]) {
        // code here
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]){
                profit += arr[i] - arr[i - 1];
            }
        }
        return profit;
    }
}

// int fProfit = 0, t2 = 0, t3 = 0;
//         int c1 = 0, c2 = 0;
//         for (int i = 0; i <= arr.length - 2; i++) {
//             if (c1 == 0){
//                 if (arr[i] < arr[i + 1]){
//                     t2 = arr[i];
//                     c1 = 1;
//                 }
//             }
//             if (c2 == 0) {
//                 if (arr[i] > arr[i + 1]) {
//                     t3 = arr[i];
//                     c2 = 1;
//                 }
//             }
            
//             if (t2 != 0 && t3 != 0){
//                 fProfit += t3 - t2;
//                 c1 = 0;
//                 c2 = 0;
                
//             }
//         }
//         return fProfit;

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
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
            int res = obj.stockBuySell(arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends