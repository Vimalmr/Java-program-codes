/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        int n=0;
        ListNode temp = head;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        temp = head;
        int[] nums = new int[n];
        for(int i=0;i<n; i++){
            nums[i]=temp.val;
            temp=temp.next;
        }
        System.out.println(nums);
        return heightBal(nums, 0, n-1);
    }

     TreeNode heightBal(int[] nums, int l, int r){
        if(l>r) return null;
        int mid = (l + r)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = heightBal(nums, l, mid-1);
        root.right = heightBal(nums, mid+1, r);
        return root;
    }

}
