//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        int ln = arr.length;
        int chk = ln/2;
        // int store = 0;
        // if (ln == 1) {
        //     return arr[0];
        // }
        for (int i = 0; i < ln; i++) {
            // cnt = 0;
            int cnt = 0;
            // int num = arr[i];
            for (int j = 0; j < ln; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if (cnt > chk) {
                return arr[i];
            }
        }
        return -1;
    }
}