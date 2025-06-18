class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        // Stack<Integer> st = new Stack<>();
        // ArrayList<Integer> al = new ArrayList<>();
        // for (int i = 0; i < q.size(); i++) {
        //     if (i < k) {
        //         st.push(q.poll());
        //     }
        //     al.add(q.poll());
        // }
        // for (int i = 0; i < k; i++) {
        //     q.add(st.pop());
        // }
        // for (int i = k; i < q.size(); i++) {
        //     q.add(al.get(i));
        // }
        // return q;
        if (q == null || k > q.size() || k < 0) {
            return q;
        }
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) {
            st.push(q.poll());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.poll());
        }
        return q;
    }
}