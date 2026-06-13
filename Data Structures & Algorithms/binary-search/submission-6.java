class Solution {

    
public static int binarySearch(int[] nums, int target, int s, int e) {
    if (s > e) {
        return -1; // Base case: target not found
    }

    int mid = s + (e - s) / 2; // Prevent potential overflow
    if (nums[mid] == target) {
        return mid; // Target found
    }

    if (target < nums[mid]) {
        return binarySearch(nums, target, s, mid - 1); // Search in the left half
    } else {
        return binarySearch(nums, target, mid + 1, e); // Search in the right half
    }
}

public static int search(int[] nums, int target) {
    int l=0, r= nums.length -1;
    while(l<=r){
        int m = l+ (r-l)/2;
        if(nums[m] == target){
            return m;
        }
        if(target < nums[m]){
            r = m-1;
        }else{
            l= m+1;
        }
    }
    return -1;
    //return binarySearch(nums, target, 0, nums.length - 1);
}
}
