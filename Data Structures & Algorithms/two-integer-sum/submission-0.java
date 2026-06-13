class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int [] res = new int[2];
        int c=0;
        for(int a : nums){
            if(map.containsKey(a)){
                res[0] = map.get(a);
                res[1] = c;
                return res;
            }
            map.put((target - a) , c);
            c +=1 ;
        }
        return res;
        
    }
}
