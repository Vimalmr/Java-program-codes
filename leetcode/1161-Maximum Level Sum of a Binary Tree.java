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
    HashMap<Integer, Integer> hash = new HashMap<>();
    void inorder(TreeNode root, int n){
        if(root!=null){
            inorder(root.left, n+1);
            hash.put(n, hash.getOrDefault(n, 0)+root.val);
            inorder(root.right, n+1);
        }
    }
    public int maxLevelSum(TreeNode root) {
        inorder(root, 1);
        int maxval=Integer.MIN_VALUE, maxlvl=1;
        for(int i: hash.keySet()){
            if(hash.get(i)>maxval){
                maxval = hash.get(i);
                maxlvl = i;
            }
        }
        return maxlvl;
    }
}
