class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        Set<Integer> set = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());
        //Set<Integer> set = new HashSet<>(Arrays.asList(nums));
        for(int i=0; i<nums.length; i++){
            int data = nums[i];
            if(set.contains(data-1)){
                continue;
            }
            int temp = 1;
            while(set.contains(data+1)){
                temp++;
                data++;

            }
            ans = Math.max(ans, temp);
        }
        return ans;
    }
}
