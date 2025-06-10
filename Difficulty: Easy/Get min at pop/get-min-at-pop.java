class GetMin {
    // Function to push all the elements into the stack.
    public static ArrayList<Integer> arrList=new ArrayList<>();
    public static Stack<Integer> s=new Stack<>();
    public static Stack<Integer> _push(int arr[],int n)
    {
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            s.push(arr[i]);
            if (s.peek() < min) {
                min = s.peek();
                arrList.add(min);
            } else{
                 arrList.add(min);
            }
         }
         return s;
    }

    // Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
        int size=arrList.size()-1;
        while(!s.isEmpty())
        {
            s.pop();
            System.out.print(arrList.remove(size)+" ");
            size--;
        }
    }
}