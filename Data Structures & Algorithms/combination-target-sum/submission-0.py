class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        ans = []
        curr = []
        n = len(nums)

        def helper(index,csum):

            if csum == target :
                ans.append(curr.copy())
                return

            if csum > target:
                return 
            
            for i  in range(index,n):

                curr.append(nums[i])

                helper(i,csum+nums[i])

                curr.pop()

        helper(0,0)

        return ans

            
        