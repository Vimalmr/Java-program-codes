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
    public boolean traverse(TreeNode temp, int targetsum, int sum){
        if(temp == null)
            return false;
        if(temp.left==null && temp.right==null){
            sum += temp.val;
            if(sum == targetsum){
                return true;
            }
            return false;
        }
        return traverse(temp.left, targetsum, sum+temp.val) || traverse(temp.right, targetsum, sum+temp.val);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return traverse(root, targetSum, 0);
    }
}
