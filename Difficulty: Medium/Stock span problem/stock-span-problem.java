
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        if(arr.length==1)
            return new ArrayList<>(List.of(1));
        int count = 1;
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        Stack<int [] > stack = new Stack<>();
        stack.push(new int[]{arr[0],count});
        for (int i =1; i<arr.length ;i++)
        {   
               while(!stack.isEmpty() && stack.peek()[0]<=arr[i]){
               int [] pair = stack.pop();
               count = count + pair[1];
               }
               stack.push(new int[]{arr[i],count});
               result.add(count);
               count=1;
               
        }
        return result;
    }
}

