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
    public ListNode Kthnode(ListNode node,int k){
            ListNode head=node;
        for(int i=1;i<k;i++){

            if(head==null) return null;
            head=head.next;
        }
        return head;
    }
    public ListNode reverse(ListNode head){

        ListNode prev=null;
        ListNode curr=head;
        ListNode temp=null;
        while(curr!=null){

            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode prev=null;
        ListNode temp=head;

        while(temp!=null){

            ListNode kthnode=Kthnode(temp,k);

            

                if(kthnode==null){

                    if(prev!=null){
                        prev.next=temp;
                    }
                    break;
                }

            
            ListNode nextnode=kthnode.next;
            kthnode.next=null;
            ListNode newnode=reverse(temp);
            if(temp==head){
                head=newnode;
            }
            else{
                prev.next=newnode;

            }
            prev=temp;
            temp=nextnode;



        }
        return head;
    }
}
