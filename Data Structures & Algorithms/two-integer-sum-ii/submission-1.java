class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int [] res = new int[2];
        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(numbers[i])){
                //System.out.println("contains key ::"+numbers[i]+ "\t"+numbers[i]);
                res[0] = map.get(numbers[i]);
                res[1] = i+1;
                return res;
            }
            int diff = target - numbers[i];
            //System.out.println("put::"+diff+ "\t"+numbers[i]);
            
            map.put(diff, i+1);
            //System.out.println(map.toString());
        }
        return res;
        
    }
}
