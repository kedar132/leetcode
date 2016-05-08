/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        ListNode Temp=node;
        int n=node.val;
        ListNode nxt=node.next;
        ListNode far=nxt.next;
        Temp.val=nxt.val;
        Temp.next=far;
        
    }
}