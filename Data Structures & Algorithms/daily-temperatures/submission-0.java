class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int res [] = new int[temp.length];

        for(int i = 0; i< temp.length; i++){
            for(int j = i; j< temp.length; j++){
                if(temp[j]> temp[i]){
                    res[i] = j-i;
                    break;
                }
            }
        }
        return res;
        
    }
}
