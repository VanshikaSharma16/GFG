// User function Template for Java

class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                cnt++;
                st.push(cnt);
                al.add(cnt);
            } else if (ch == ')') {
                if (!st.isEmpty()) {
                    al.add(st.pop());
                }
            }
        }
        return al;
    }
};