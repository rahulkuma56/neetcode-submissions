class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> que = new PriorityQueue<>(k); 

        for(int e:nums){
            
            que.offer(e);
            if(que.size()>k){
                que.poll();
            }
        }

        return que.peek();
        
    }
}
