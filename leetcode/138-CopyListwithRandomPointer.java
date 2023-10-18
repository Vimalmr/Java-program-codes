/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node temp1 = head;
        Node nex;

        //Inserting new nodes in between
        while(temp1!=null){
            Node n = new Node(temp1.val);
            n.next=temp1.next;
            temp1.next = n;
            temp1=n.next;
        }
        temp1=head;

        //Now map random pointer to the newly inserted node
        while(temp1!=null){
            nex = temp1.random;
            if (nex != null) {
                temp1.next.random = nex.next;
            }
            temp1 = temp1.next.next;
        }
        temp1=head;
        Node head2 = head.next;
        Node temp2=head2;

        //Now remove the newly inserted nodess from the previous linked list
        while(temp1!=null){
            temp1.next=temp2.next;
            if(temp2.next!=null)
                temp2.next=temp2.next.next;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return head2;
    }
}
