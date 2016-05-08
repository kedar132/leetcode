/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1=null;
        ListNode p2=null;
        if(l1==null && l2==null){
            return null;
        }
        if(l1==null && l2!=null)
        return l2;
        if(l1!=null && l2==null)
        return l1;
        if(l1.val<l2.val){
            p1=l1;
            p2=l2;
        }
        else{
            p1=l2;
            p2=l1;
        }
       ListNode head=p1;
        ListNode p12=p1.next;
        
        while(p12!=null){
            if(p12.val <= p2.val){
                p1=p1.next;
                p12=p1.next;
               
            }
            else{
                p1.next=p2;
                p2=p12;
                p12=p1.next;
            }
        }
        p1.next=p2;
        return head;
  
    }
}