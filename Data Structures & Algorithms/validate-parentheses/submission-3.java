class Solution {
    public boolean isValid(String s) {
      Stack<Character> st = new Stack<>();
        for(char sc : s.toCharArray()){
            if(sc == '(' || sc == '{' || sc == '[' ){
                st.push(sc);
            }else if(!st.isEmpty() &&((sc == ')' && st.peek() == '(') || (sc == ']' && st.peek() == '[') || (sc == '}' && st.peek() == '{') ) && (!st.isEmpty()) ){
                st.pop();
                continue;
            }else{
                return false;
            }
        }

        

        return st.isEmpty();
        
    }
}
