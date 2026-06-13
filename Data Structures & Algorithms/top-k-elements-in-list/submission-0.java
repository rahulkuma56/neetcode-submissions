class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        List<Integer> freq [] = new List[nums.length+1];
        for(int i=0;i<freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int e: nums){
          map.put(e,map.getOrDefault(e,0)+1);    
        }
        System.out.println(map);
        for(Map.Entry<Integer, Integer> es : map.entrySet()){
            freq[es.getValue()].add(es.getKey());
        }
        for(List l: freq){
            System.out.println(l);
        }
        int [] res = new int[k];
        int index = 0;
        for(int i = freq.length-1; i > 0 && index < k; i-- ){
            for(int n: freq[i]){
                res[index++] = n;
                if(index == k){
                    return res;
                }
            }
        }
        return res;
        
    }
}
