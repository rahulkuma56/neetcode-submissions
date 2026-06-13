/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if( p==null || q == null) return false;

        return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right); 

    //    boolean b= isSameTree(p.left,q.left);
    //    System.out.println("p.left::"+p.left+"\t q.left::"+q.left+"\t bollean:: "+b);
    //    boolean c = isSameTree(p.right,q.right);
    //     System.out.println("p.right::"+p.right+"\t q.right::"+q.right+"\t boolean ::"+c);
    //    return b &&c;
    }
}
