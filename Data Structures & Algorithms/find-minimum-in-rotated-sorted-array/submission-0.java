class Solution {
    // public int getMin(int nums, int l, int r){
    //     int m = (l+r)/2;
    //     if(nums[l]< nums[m]){
    //         return 

    //     }
    // }
    public int findMin(int[] nums) {
        int l=0, r= nums.length-1;
       
        while(l<r){
            int m = (l+r)/2;
            if(nums[m]< nums[r]){
                r = m;
            }else{
                l = m+1;
            }
        }
        return nums[l];
    }
}
