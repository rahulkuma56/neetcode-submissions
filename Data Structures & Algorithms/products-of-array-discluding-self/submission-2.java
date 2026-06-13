class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] op =  new int[nums.length];
        int prod = 1;
        int zeroIndx= -1;
        boolean flag = false;
        for(int i = 1; i< nums.length; i++){
            if(flag && nums[i]==0){
                return op;
            }
            
            if(nums[i]==0){
                flag = true;
                zeroIndx = i;
                prod *=nums[0];
                continue;
            }
            prod *= nums[i];

        }
        if(flag){
            op[zeroIndx] = prod;
            return op;
        }
        op[0] = prod;
        for(int i=1; i<nums.length; i++){
            prod *=nums[i-1];
            if(nums[i] != 0){
                prod /=nums[i];
            }
            op[i] = prod;
        }
        return op;
        
    }
}  
