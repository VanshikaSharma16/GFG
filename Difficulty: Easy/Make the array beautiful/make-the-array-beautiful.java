class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        for (int num: arr) {
            if (!st.isEmpty() && ((st.peek() >= 0 && num < 0) || (st.peek() < 0 && num >= 0))){
                st.pop();
            } else {
                st.push(num);
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int num: st) {
            al.add(num);
        }
        return al;
    }
}
