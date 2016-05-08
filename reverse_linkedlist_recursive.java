public class Solution {
    public ListNode reverseList(ListNode head) {
        int flag=0;
        ListNode mainhead=null;
        
            ListNode p1=head;
            if(head.next!=null){
                reverseList(head.next);
            }
            head.next=p1;
            if(flag==0){
                mainhead=head;
                flag=1;
            }
        
        return mainhead;
    }
}