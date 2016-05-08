/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode p1=head;
        ListNode p2=p1.next;
        //ListNode p3=null;

        while(p2!=null){
            if(p2.val==val){
                p1.next=p2.next;
                p2=p1.next;
                
            }
            else{
                p1=p2;
                p2=p2.next;
            }
            
        }
        if(head.val==val && head.next==null){
            return null;
        }
        else if(head.val==val){
            head=head.next;
        }
        
        return head;
        
    }
}