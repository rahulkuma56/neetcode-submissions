class Solution {

    public boolean validateStrings(String s2, String s1){
        System.out.println("S2::"+s2+"\tS1::"+s1);
        for(char c : s2.toCharArray()){
            if(!s1.contains(Character.toString(c))){
                return false;
            }
            s1 = s1.replace(Character.toString(c), "");
            
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int l =0; 
        if(s2.contains(s1)){
            return true;
        }

        for(int i=0; i<=s2.length()- s1.length(); i++){
            if(s1.contains(Character.toString(s2.charAt(i)))){
                if(validateStrings(s2.substring(i, i+s1.length()), s1)){
                    return true;
                } 
            }

        }
        return false;
    }
}
