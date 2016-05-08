/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null ){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode p1,p2;
        p1=head.next;
        p2=p1.next;
        p1.next=head;
        head.next=p2;
        head=p1;
        p1=head.next;
        while(p2!=null && p2.next!=null){
            ListNode Last=p1;
            p1=p1.next;
            p2=p1.next;
            ListNode temp=p2.next;
            Last.next=p2;
            p2.next=p1;
            p1.next=temp;
            p2=temp;
        }
        return head;
        
    }
}