class Queue {
    Stack<Integer> input = new Stack<Integer>();
    Stack<Integer> output = new Stack<Integer>();

    int dequeue() {
        // code here
        if (input.isEmpty()) return -1;
        while (!input.isEmpty()) {
            output.push(input.pop());
        }
        int x = output.pop();
        while (!output.isEmpty()) {
            input.push(output.pop());
        }
        return x;
    }

    void enqueue(int x) {
        // code here
        input.add(x);
    }
}
