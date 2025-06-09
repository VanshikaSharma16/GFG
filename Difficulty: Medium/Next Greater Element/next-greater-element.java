class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> list =new ArrayList<>();
        int n=arr.length;
        int[] res=new int[n];
        res[n-1]=-1;
        Stack<Integer> st=new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while( st.isEmpty() == false && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty() ) 
            res[i]=-1;
            else res[i]=st.peek();
            st.push(arr[i]);
        }
        for(int num:res){
            list.add(num);
        }
        return list;
        
    }
}