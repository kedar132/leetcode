/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode p1=head;
        ListNode p2=head.next;
        while(p1.next!=null){
        
            while(p2.val==p1.val){
                if(p2.next !=null){
                p2=p2.next;
                }
                else{
                    p1.next=null;
                    return head;
                }
               
                }
                
                p1.next=p2;
                p1=p2;
                p2=p1.next;
                
        }
       return head; 
    }
}