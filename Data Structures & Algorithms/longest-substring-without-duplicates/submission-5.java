class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Set<Character>. set = new HashSet();
       
       
        int l = 0;
        int r = s.length();
        int i=1, max = 0;
        
        while(l<r && i<r){
            if(!(s.substring(l,i).contains(Character.toString(s.charAt(i))))){
                i++;
                continue;
            }
            max = Math.max(max, s.substring(l,i).length());
             while(l<i){
                if (s.charAt(l) == s.charAt(i)) {
                    l++;
                    break;
                }else{
                    l++;
                }
             }
        }
         max = Math.max(max, s.substring(l,r).length());
           
        return max;
    }
}
