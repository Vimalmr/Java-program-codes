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
    private ListNode merge(ListNode l3, int val){
        ListNode n = new ListNode(val), t=l3;
        if(l3==null){
            n.next=null;
            l3=n;
        }
        else{
            while(t.next!=null){
                t=t.next;
            }
            n.next=null;
            t.next=n;
        }
        return l3;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1, t2=list2, l3=null;
        while(t1!=null && t2!=null){
            if(t1.val > t2.val){
                l3 = merge(l3, t2.val);
                t2=t2.next;
            }
            else if(t1.val< t2.val){
                l3 = merge(l3, t1.val);
                t1=t1.next;
            }
            else{
                l3 = merge(l3, t1.val);
                l3 = merge(l3, t2.val);
                t1=t1.next;
                t2=t2.next;
            }
        }
        if(t1!=null){
            while(t1!=null){
                l3 = merge(l3, t1.val);
                t1=t1.next;
            }
        }
        else if(t2!=null){
            while(t2!=null){
                l3 = merge(l3, t2.val);
                t2=t2.next;
            }
        }
        return l3;
    }
}
