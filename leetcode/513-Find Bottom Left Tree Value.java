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
    int nn=-1, val=0; 
    void inorder(TreeNode root,int n,int side){
        if(root!=null){
            if(n>nn){
                nn=n;
                val=root.val;
            }
            inorder(root.left, n+1, 0);
            inorder(root.right, n+1, 1);
        }
    }
    public int findBottomLeftValue(TreeNode root) {
        inorder(root, 0, 0);
        return val;
    }
}
