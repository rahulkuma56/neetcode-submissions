class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        int res = 0;
        for(String t : tokens){
            if("+".equals(t)){
           int a= Integer.parseInt(s.peek());
            s.pop();
            int b= Integer.parseInt(s.peek());
            s.pop();
            s.push(Integer.toString(a+b));

            }else if("-".equals(t) ) {
            int a= Integer.parseInt(s.peek());
            s.pop();
            int b= Integer.parseInt(s.peek());
            s.pop();
            s.push(Integer.toString(b-a));
            }else if("*".equals(t)){
            int a= Integer.parseInt(s.peek());
            s.pop();
            int b= Integer.parseInt(s.peek());
            s.pop();
            s.push(Integer.toString(a*b));
            }else if("/".equals(t)){
            int a= Integer.parseInt(s.peek());
            s.pop();
            int b= Integer.parseInt(s.peek());
            s.pop();
            s.push(Integer.toString(b/a));
            
           // s.push("0");

            }else{
            s.push(t);
            }
        }
        return Integer.parseInt(s.peek());
        
    }
}
