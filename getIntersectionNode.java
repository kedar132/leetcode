/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1=headA;
        ListNode p2=headB;
        int count=0;
        int count1=0;
        while(p1!=null){
            p1=p1.next;
            count++;
        }
        while(p2!=null){
            p2=p2.next;
            count1++;
        }
        int diff=0;
        
        if(count>count1){
            diff=count-count1;
            p1=headA;
            p2=headB;
        }
        else{
            diff=count1-count;
            p1=headB;
            p2=headA;
        }
        
    
    
    while(diff>0){
        p1=p1.next;
        diff--;
    }
    while(p1!=p2 && p1!=null && p2!=null){
        p1=p1.next;
        p2=p2.next;
    }
    if(p1==null || p2==null){
        return null;
    }
    
    return p1;
}
}