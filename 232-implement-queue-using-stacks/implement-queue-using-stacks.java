class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public MyQueue() {   
    }
    
    public void push(int x) {
        if(st.size()==0) st.push(x);
        else{
            while(st.size()>0){
                helper.push(st.pop());
            }
            st.push(x);
            while(helper.size()>0){
                st.push(helper.pop());
            }
        }
    }
    
    public int pop() {
        if(st.size() == 0) return -1;
        int x = st.pop();
        return x;
    }
    
    public int peek() {
        if(st.size() == 0) return -1;
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
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