/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
      public boolean isPalindrome(ListNode head) {
          if(head==null){
                return true;
            }
            
            ListNode p1=head;
            ListNode p2=head;
            int count=1;
            while(p2.next!=null){
                count++;
                p2=p2.next;
            }
            int mid=0;
            if(count==1){
                return true;
            }
            if(count==2){
                if(head.val==head.next.val){
                    return true;
                }
                else
                return false;
            }
            if(count%2==0){
                mid=count/2;
            }
            else{
                mid=(count+1)/2;
            }
            int m=1;
            while(m<mid){
                p1=p1.next;
                m++;
            }
            
            ListNode temp=p1.next;
            p1.next=null;
            ListNode p3=null;
            while(temp!=null){
                p2=temp.next;
                temp.next=p3;
                p3=temp;
                temp=p2;
                
            }
            while(p3!=null && head!=null){
                if(p3.val!=head.val){
                    return false;
                }
               
                p3=p3.next;
                
                head=head.next;
                
            }
            return true;
        }
}