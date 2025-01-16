//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.findSum(a,n));
        
System.out.println("~");
}
        
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    public static int findSum(int arr[],int N) 
    {
        //code here
        int minn = arr[0];
        int maxx = arr[0];
        for (int i = 1; i < N; i++) {
            if (minn > arr[i]) {
                minn = arr[i];
            }
            if (maxx < arr[i]) {
                maxx = arr[i];
            }
        }
        int sum = minn + maxx;
        return sum;
    }
}
