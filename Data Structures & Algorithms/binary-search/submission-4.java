class Solution {

    
public static int binarysearch(int [] nums, int target, int s, int e){
        
       
        if(target == nums[s]){
            return s;
        }
        if(target == nums[e]){
            return e;
        }
         
        int p = (s+e)/2;
        if(s>e || p==0){
            return -1;
        }
        if(nums[p] == target)
            return p;

        if(target < nums[p]){
           return binarysearch(  nums, target, s+1,  p-1);
        }else{
            return binarysearch(  nums, target, p+1,  e-1);
        }


    }
    public static int search(int [] nums, int target){
        int e = nums.length - 1;
        return binarysearch(nums,target, 0, e);

    }
}
