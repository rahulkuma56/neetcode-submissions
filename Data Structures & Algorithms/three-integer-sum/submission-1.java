class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>  res =  new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0 ; i< nums.length; i++){
            int l=i+1, r=nums.length-1;
            int sum = 0;
             if(nums[i]>0){
                break;
            }
             if(nums[i]>0){
                break;
            }

            if(i>0 && nums[i-1] == nums[i]){
                continue;
            }
            
            while(l < r){
                sum = nums[i]+nums[l]+nums[r];
                System.out.println("Sum:: "+ sum+"\tnums[i]:: "+ nums[i]+"\tnums[l]:: "+ nums[l]+"\tnums[r]:: "+ nums[r]);
                if(sum < 0){
                    l++;
                }else if(sum > 0){
                    r--;
                }else{
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(nums[l] == nums[l-1] && l<r){
                        l++;
                    }
                    //break;
                    
                }
            }
        }
        return res;

    }
}
