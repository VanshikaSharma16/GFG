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

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

     void conquer(int arr[],int l,int mid,int r){
         int matrix[]=new int[r-l+1];
         
         int indx1=l;
         int indx2=mid+1;
         int x=0;
         
         while(indx1 <= mid && indx2 <= r){
             if(arr[indx1] < arr[indx2]){
                 matrix[x++]=arr[indx1++];
                 
             }
             else{
                 matrix[x++]=arr[indx2++];
             }
         }
         
         while(indx1 <= mid ){
             matrix[x++]=arr[indx1++];
         }
         while( indx2 <= r){
             matrix[x++]=arr[indx2++];
         }
         
         for(int i=0,j=l;i<matrix.length;j++,i++){
             arr[j] = matrix[i];
         }
         
     }
    void mergeSort(int arr[], int l, int r) {
        // code here
        
        if(l >= r){
            return;
        }
        int mid=l+(r-l)/2;
        
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        conquer(arr, l, mid, r);
        
    }
}


