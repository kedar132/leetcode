/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode p1=head.next;
        ListNode p2=head.next;
        ListNode temp=head;
        ListNode temp1=null;
        ListNode second=p1;
        int count=2;
        while(p2!=null){
            if(count%2==0){
                count++;
                p2=p2.next;
               
            }
            else if(count%2!=0){
                temp1=p2.next;
                temp.next=p2;
                p2.next=second;
                p1.next=temp1;
                temp=p2;
                
                p2=p1.next;
                p1=p1.next;
              
                count++;
            }
        }
        return head;
    }
}