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
    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    void traverse(TreeNode root, boolean flag){
        if(root!=null){
            if(root.left!=null) traverse(root.left, flag);
            if(root.right != null) traverse(root.right, flag);
            if(root.left==null && root.right == null){
                if(flag){
                    l1.add(root.val);
                } else {
                    l2.add(root.val);
                }
            }
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        traverse(root1, true);
        traverse(root2, false);
        int n = l1.size(), m = l2.size();
        if(n!=m){
            return false;
        } else {
            for(int i=0 ;i<n ;i++){
                if(l1.get(i) != l2.get(i)) return false;
            }
            return true;
        }
    }
}
