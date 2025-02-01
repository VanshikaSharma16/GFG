//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        
        int []res=new int[arr.size()];
        
        for(int x : arr){
            
            if(x>=0){
                pos.add(x);
            }
            else{
                neg.add(x);
            }
        }
        
        int i=0,j=0;
        int x=0;
        
        while(i<pos.size()  && j<neg.size()){
            
           arr.remove(x);
           arr.add(x++,pos.get(i++) );
           arr.remove(x);
           arr.add(x++,neg.get(j++) );
           
        }
        
        while(i<pos.size()){
           arr.remove(x);
           arr.add(x++, pos.get(i++) );
        }
        
        while(j<neg.size()){
           arr.remove(x);
           arr.add(x++,neg.get(j++) );
        }
    }
}