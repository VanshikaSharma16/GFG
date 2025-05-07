//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().rearrange(arr);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            // System.out.println();

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public static void rearrange(int arr[]) {
        // code here
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int index = 0;
        int[] arr1 = new int[n];
        
        Arrays.sort(arr);
        while (left <= right) {
            if (index % 2 == 0) {
                arr1[index] = arr[right];
                right--;
            } else {
                arr1[index] = arr[left];
                left++;
            }
            index++;
        }
        for (int j = 0; j < n; j++) {
            arr[j] = arr1[j];
        }
    }
}
