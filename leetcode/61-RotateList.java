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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int len=0;
        if(head==null){
            return null;
        }
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        temp=head;
        if(k>=len){
            k=k%len;
        }
        if(k==0){
            return head;
        }
        int rotate = len-k,i=1;
        for(i=1;i<=rotate;i++){
            if(i==rotate){
                ListNode tt = temp;
                temp=temp.next;
                tt.next=null;
            }
            else{
                temp=temp.next;
            }
        }
        ListNode st = temp;
        for(int j=i;j<len;j++){
            temp = temp.next;
        }
        temp.next=head;
        head=st;
        return head;
    }
}
