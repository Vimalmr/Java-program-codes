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
    public int travel(TreeNode root, int sum){
        if(root==null){
            return 0;
        }
        if(root.right==null && root.left==null){
            return sum=sum*10+root.val;
        }
        return travel(root.left, sum*10+root.val) + travel(root.right, sum*10+root.val);
    }

    public int sumNumbers(TreeNode root) {
        return travel(root, 0);
    }
}
