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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count=0;
        while(!q.isEmpty()){
            int lvl = q.size();
            for(int i=0;i<lvl;i++){
                if(q.peek().left==null && q.peek().right==null){
                    return ++count;
                }
                else{
                    if(q.peek().left!=null){
                        q.add(q.peek().left);
                    }
                    if(q.peek().right!=null){
                        q.add(q.peek().right);
                    }
                    int t = q.remove().val;
                }
            }
            count++;
        }
        return count;
    }
}
