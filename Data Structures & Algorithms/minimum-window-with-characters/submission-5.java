class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()){
            return "";
        }
        Map<Character, Integer> countT  = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for(char c : t.toCharArray()){
            //countT.putIfAbsent(c,0);
            countT.put(c, countT.getOrDefault(c,0)+1);
        }

         int match = 0, substr=0; // have = 0, need = t.length();
         int l = 0 ,  resLen = s.length()+1;
         int [] res = new int[2];
         for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(countT.containsKey(ch)){
                countT.put(ch, countT.get(ch)-1);
                if(countT.get(ch) == 0)
                match++;
            }
           // window.put(ch, window.getOrDefault(ch,0)+1);
           while(match == countT.size()){
            if(resLen > i-l+1){
                resLen = i-l+1;
                substr = l;
            }
            char deleted = s.charAt(l++);
            if(countT.containsKey(deleted)){
                if(countT.get(deleted) == 0){
                    match--;
                }
                countT.put(deleted, countT.get(deleted)+1);
            }
           }
        /*if(t.contains(Character.toString(ch)) && window.get(ch) == countT.get(ch) ){
            have++;
         }
         
         while(have == need){
         //update results
            if((i-l+1)< resLen){
                res[0] = l;
                res[1] = i;
                resLen = i-l+1;
                window.put(s.charAt(l), window.get(s.charAt(l))-1);
                if(countT.containsKey(s.charAt(l)) && (window.get(s.charAt(l)) < countT.get(s.charAt(l)))){
                     have--;
                }
                l++;
            }
         }*/
         
         
        }
        

         return resLen > s.length() ?  "" :  s.substring(substr, substr+resLen);

        
    }
}
