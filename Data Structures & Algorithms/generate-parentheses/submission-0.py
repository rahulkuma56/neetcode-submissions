class Solution:
    def generateParenthesis(self, n: int) -> List[str]:

        curr = ""

        ans = []

        def helper(curr,ope,clo):

            if len(curr) == 2*n:
                ans.append(curr)
                return 
            

            if ope < n:

            

                curr += "("
                helper(curr,ope+1,clo)

                curr = curr[:-1]

            if clo<ope:
                curr += ")"
                helper(curr,ope,clo+1)
                curr = curr[:-1]


        
        helper(curr,0,0)

        return ans


        