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

    void traverse(TreeNode root, int n){
        if(root!=null){
            hash.put(n, hash.getOrDefault(n, 0)+root.val);
            traverse(root.left, n+1);
            traverse(root.right, n+1);
        }
    }
    public int deepestLeavesSum(TreeNode root) {
        traverse(root, 0);
        int max = 0;
        for(int i: hash.keySet()){
            if(i > max){
                max = i;
            }
        }
        return hash.get(max);
    }
}
