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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        
        int targetVal = targetSum - root.val;
        if(root.left == null && root.right == null && targetVal == 0) return true;
        
        boolean lS = hasPathSum(root.left, targetVal);
        boolean rS = hasPathSum(root.right, targetVal);
        
        return lS || rS;      
    }
}