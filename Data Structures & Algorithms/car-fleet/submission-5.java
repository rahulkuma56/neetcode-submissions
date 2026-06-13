class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Float> st = new Stack<>();
        Map<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());

        
        //List<Integer> list = Arrays.asList(position);
        //Collections.sort(list, Collections.reverseOrder());
         for(int i = 0; i< position.length; i++){
            map.put(position[i],speed[i]);
         }

       
        for(Map.Entry e : map.entrySet()){
            float time = (float) (target - (int)e.getKey())/ (int)e.getValue();
            System.out.println(e.getKey()+"\t speed::"+e.getValue()+"\t time::"+time);
            if(!st.isEmpty() &&st.peek() >= time){
                continue;
            }
            st.push(time);
           
        }

        return st.size();

        
    }
}
