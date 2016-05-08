/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return;
        }
        ListNode temp=head;
        int counter=1;
        while(temp.next!=null){
            temp=temp.next;
            counter++;
        }
        if(counter%2!=0){
            counter=counter+1;
        }
        int mid=counter/2;
        temp=head;
        ListNode temp1=null;
        while(mid>0){
            temp1=temp;
            temp=temp.next;
            mid--;
        }
        temp1.next=null;
        //System.out.println(temp.val);
        ListNode temp2=reverse(temp);
        ListNode just=null;
        ListNode nest=head;
        while(head!=null && temp2!=null){
            just = head.next;
            head.next = temp2;
            head=temp2;
            temp2=just;
        }

    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp1=null;
        
        while(head!=null){
        ListNode temp2 = head.next;
        head.next=null;
        head.next=temp1;
        temp1=head;
        head=temp2;
        
        }
        return temp1;
       
    }

    
}