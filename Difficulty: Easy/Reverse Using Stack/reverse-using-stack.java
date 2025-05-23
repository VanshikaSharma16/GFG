// import 
class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> s = new Stack<>();
        StringBuffer ans = new StringBuffer();
        
        for (int i = 0; i < S.length(); i++) {
            s.push(S.charAt(i));
        }
        
        while (s.size() > 0) {
            ans.append (s.pop());
        }
        return ans.toString();
    }
}