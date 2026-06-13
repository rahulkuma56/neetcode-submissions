class MinStack {
    Stack<Integer> s;
     Stack<Integer> as;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        s = new Stack<>();
        as = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(as.isEmpty() || as.peek() >= val){
            as.push(val);
        }
    }
    
    public void pop() {
        if(!s.isEmpty()){
            if(!s.isEmpty() && s.peek().equals(as.peek()))
                as.pop();
            s.pop();}
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return as.peek();
    }
}
