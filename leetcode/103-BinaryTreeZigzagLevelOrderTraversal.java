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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = false;
        while(!q.isEmpty()){
            int lvl = q.size();
            List<Integer> sublvl = new ArrayList<>();
            for(int i=0;i<lvl;i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                sublvl.add(q.remove().val);
            }
            if(flag){
                int j=0,k=sublvl.size()-1;
                while(j<k){
                    int t=sublvl.get(j);
                    sublvl.set(j,sublvl.get(k));
                    sublvl.set(k,t);
                    j++;
                    k--;
                }
                flag=false;
            }
            else{
                flag=true;
            }
            ans.add(sublvl);
        }
        return ans;
    }
}
