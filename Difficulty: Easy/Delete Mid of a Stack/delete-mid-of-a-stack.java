class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        int ln = s.size();
        int mid = ln/2;
        deletemiddleUtil (s, mid);
    }
    private void deletemiddleUtil (Stack<Integer> s, int mid) {
        if (mid == 0) {
            s.pop();
            return;
        }
        int top = s.pop();
        deletemiddleUtil(s, mid - 1);
        s.push(top);
    }
}