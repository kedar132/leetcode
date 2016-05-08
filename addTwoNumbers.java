/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0, dig1 = 0, dig2 = 0;
    ListNode node1 = l1;
    ListNode node2 = l2;
    ListNode res = new ListNode(0);
    ListNode pre = res;
    while(node1 != null || node2 != null) {
        if(node1 != null) {
            dig1 = node1.val;
            node1 = node1.next;
        }
        else dig1 = 0;
        if(node2 != null) {
            dig2 = node2.val;
            node2 = node2.next;
        }
        else dig2 = 0;

        int sum = (dig1 + dig2 + carry) % 10;
        carry = (dig1 + dig2 + carry) / 10;
        ListNode cur = new ListNode(sum);
        pre.next = cur;
        pre = pre.next;
    }
    if(carry == 1) {
        ListNode cur = new ListNode(1);
        pre.next = cur;
    }
    return res.next;
}

}