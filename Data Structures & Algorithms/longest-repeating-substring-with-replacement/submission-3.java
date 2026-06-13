class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap();

        int l=0,r=s.length()-1;
        int max=0;
        //int op = k;
        //boolean flag = true;
       // int l_next = 0;
        for(int i = 0; i <=r; i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            max = Math.max(max,map.get(s.charAt(i)));

            if((i - l + 1)- max > k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
            }
        }
        return r - l+1;
       
    }
}
