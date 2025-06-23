
class Solution {
// Function to check if a string can be obtained by rotating
// another string by exactly 2 places.
public static boolean isRotated(String s1, String s2) {
    // Your code here
    if(s1.length() != s2.length() || s1.length() < 2){
        return s1.equals(s2);
    }
    
    String left = s1.substring(2) + s1.substring(0,2);
    
    String right = s1.substring(s1.length() - 2) + s1.substring(0, s1.length() - 2);


    return s2.equals(left) || s2.equals(right);
    }
}