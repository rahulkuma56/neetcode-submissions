class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        //int  s []  = new int[nums.length - k + 1];
        int res [] = new int[nums.length - k + 1];
        PriorityQueue<Integer>  pq = new PriorityQueue<>(k+1, Collections.reverseOrder());
        int c = -1;
        for(int i=0; i< nums.length; i++){
            pq.offer(nums[i]);
            if(pq.size() == k){
               res[++c] = pq.peek();
                pq.remove(nums[c]);
                
            }
            
        } 
        return res;
        
    }
}
