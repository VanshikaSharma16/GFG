//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            char res = ob.firstRep(s);
            if (res == '#')
                System.out.println(-1);
            else
                System.out.println(res);
             
        
System.out.println("~");
}
    }
}
// } Driver Code Ends

class Solution {
    char firstRep(String S) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch: S.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char c: S.toCharArray()) {
            if (map.get(c) > 1)
            return c;
        }
        return '#';
    }
}
