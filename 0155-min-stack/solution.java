class MinStack 
{
    Stack<Integer>stack1;
    Stack<Integer>stack2;

    public MinStack() 
    {
        this.stack1 = new Stack<Integer>();
        this.stack2 = new Stack<Integer>();
    }
    
    public void push(int value) 
    {
        stack1.push(value);
        if (stack2.size() == 0)
        {
            stack2.push(value);
            return;
        }
        if (stack2.peek() <= value)
        {
            stack2.push(stack2.peek());
            return;
        }
        stack2.push(value);
    }
    
    public void pop() 
    {
        stack1.pop();
        stack2.pop();
    }
    
    public int top() 
    {
        return stack1.peek();
    }
    
    public int getMin() 
    {
        return stack2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
