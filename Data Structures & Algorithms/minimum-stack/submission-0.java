class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int num) {
        st.push(num);
        if(minSt.isEmpty())
        {
            minSt.push(num);
        }
        else if(num <= minSt.peek())
        {
            minSt.push(num);
        }
        else
        {
            minSt.push(minSt.peek());
        }
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
