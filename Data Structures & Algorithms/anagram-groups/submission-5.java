class Solution {

    // public boolean checkAnagram(String s1, String s2){
    //     if(s1.length()!= s2.length()){
    //         return false;
    //     }
    //     int i =0;
    //     while(i<s1.length()){
    //         if(!s2.contains(Character.toString(s1.charAt(i)))){
    //             return false;
    //         };
    //         s2 = s2.replaceFirst(Character.toString(s1.charAt(i)),"");
    //         i++;
            
    //     }
    //     return true;
    // }
   
    public List<List<String>> groupAnagrams(String[] strs) {
       // List<List<String>> op = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        /*if(strs.length <=1){
            List<String> anagram = new ArrayList<>();
            anagram.add(strs[0]);
            op.add(anagram);
            return op;
        }
        for(int i = 0; i < strs.length; i++){
            if(strs[i].isEmpty()){
                continue;
            }
            List<String> anagram = new ArrayList<>();
            anagram.add(strs[i]);
            
            for(int j=i+1;  j<strs.length; j++){
                if(checkAnagram(strs[i], strs[j])){
                    anagram.add(strs[j]);
                    strs[j] = "";
                }
                
            }
            op.add(anagram);
        }
         return op;  */

        for(String s : strs){
            char ch [] = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            
            map.putIfAbsent(key, new ArrayList<String>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
