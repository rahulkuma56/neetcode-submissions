class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int res [] = new int[temp.length];
        Stack<int[]> s = new Stack<>();

        for(int i = 0; i< temp.length; i++){
            int t = temp[i];
            while(!s.isEmpty() && t > s.peek()[0]){
                res[s.peek()[1]] = i-s.peek()[1];
                s.pop();
            }
            
            s.push(new int[]{t,i});
        }
        return res;
        
    }
}
