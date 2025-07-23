// User function Template for Java

class Solution {
    public long countSub(String str) {
        // Your code goes here
        long op = 0;
        for (char ch: str.toCharArray()) {
            if (ch == '(') op++;
        }
        long cl = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (cl == op) return i + 1;
            if (str.charAt(i) == '(') op--;
            if (str.charAt(i) == ')') cl++;
        }
        return 0;
    }
}