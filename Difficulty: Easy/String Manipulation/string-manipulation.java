
class Solution {
    static int removeConsecutiveSame(String[] arr) {
        // Your code goes here
        Stack<String> st = new Stack<>();
        int cnt = 1;
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (!st.isEmpty() && st.peek().equals(arr[i])) {
                st.pop();
            } else {
                st.push (arr[i]);
            }
        }
        return st.size();
    }
}