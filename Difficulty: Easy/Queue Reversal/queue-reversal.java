class Solution {
    // Function to reverse the queue.
    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        // code here.
        int[] arr = new int[queue.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = queue.poll();
        }
        for (int i = arr.length-1; i >= 0; i--) {
            queue.add (arr[i]);
        }
        return queue;
    }
}