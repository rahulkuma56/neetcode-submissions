class Solution {
    public int findDuplicate(int[] nums) {
        /*int a = 1;
        int l = 0, r = nums.length-1 ;
        while(l <= r ){
            if(nums[l] < a){
                return nums[l];
            }
            if(nums[r]< a){
                return nums[r];
            }

            if(nums[l] == a){
                a++;
                l++;
            }else if(nums[r] == a){
                a++;
                r--;
            }else{
                r--;
            }
        }*/

        /*for(int i=0; i< nums.length; i++){
            if(nums[i]){
                continue;
                l++;
            }else{
                return nums[i];
            }
        }*/
       /* for(int n :  nums){
            if(num[n-1] == n){
                return n;
            }else{
                int tmp = nums[n-1];

            }
        }*/
        int [] arr = new int[nums.length];
        for(int i =0; i< arr.length; i++){
            if(arr[nums[i]-1] == 1){
                return nums[i];
            }else{
                arr[nums[i]-1] = 1;
            }
        }
        return -1;
    }
}
