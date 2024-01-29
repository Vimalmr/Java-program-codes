class MyQueue {
    Queue<Integer> q;
    public MyQueue() {
        q = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int peek() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size()==0 ? true : false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
