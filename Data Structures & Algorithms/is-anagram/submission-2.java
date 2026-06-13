class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        for(char c : s.toCharArray()){
            if(!t.contains(Character.toString(c))){
                return false;
            }
            t=t.replaceFirst(Character.toString(c), "");
            System.out.println(t);
        }

        return true;


    }
}
