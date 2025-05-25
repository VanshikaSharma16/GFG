// User function Template for Java
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        int n = st.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = st.pop();
        }
        st.push(x);
        for (int i = n - 1; i >= 0; i--) {
            st.push(arr[i]);
        }
        return st;
    }
}