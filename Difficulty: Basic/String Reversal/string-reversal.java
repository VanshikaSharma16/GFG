//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String s = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.reverseString(s));
                
System.out.println("~");
}
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String reverseString(String s)
    {
        //code here.
        StringBuilder sb = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();
        int lst = s.length() - 1;
        for (int i = lst; i >= 0; i--){
            if(!hs.contains(s.charAt(i)) && s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
                hs.add(s.charAt(i));
            } 
            
        }
        return sb.toString();
    }
}