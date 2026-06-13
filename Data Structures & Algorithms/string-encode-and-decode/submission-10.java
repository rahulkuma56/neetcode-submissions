//import java.util.*;
//import java.util.Arrays;

class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append("#").append(s);

        }
       return sb.toString();
       // return strs.toString();
    }

    public List<String> decode(String str) {
       /* str  = str.substring(1,str.length()-1);
        System.out.println(str);
         if(str.equals("\"\"")){
             List<String> op1 = new ArrayList<>();
             String value = "\"\"";
            op1.add(value);
            return op1;
         }
         if(str.isEmpty() ){
            return new ArrayList<>();
        }
        String strArr[]  = str.split(",");
        List<String> op = new ArrayList<>();
        for(String s: strArr){
            if(s != ""){
                op.add(s.trim());
            }else{
                op.add(s);
                return op;
            }  
                
        }
        return op;*/

        List<String> list = new ArrayList<>();
        int i = 0;
        while(i< str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.valueOf(str.substring(i,j));
            i = j + 1 + length;
            list.add(str.substring(j+1, i));
            
        }
        return list;



    }
}
