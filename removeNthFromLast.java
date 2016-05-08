public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || n<1)
        return null;
        
        ListNode p1=head;
        ListNode p2=head;
       // ListNode temp=head;
        for(int i=1;i<=n;i++){
            p2=p2.next;
            }
            if(p2==null){
                head=head.next;
                return head;
            }
            while(p2.next!=null){
                //temp=p1;
                p1=p1.next;
                p2=p2.next;
            }
            p1.next=p1.next.next;
            return head;
            
            
            
        
    }
}