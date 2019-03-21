package leetcode;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/21 20:06
 */
public class Question19 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h=new ListNode(0); h.next=head;

        ListNode temp2=head;
        ListNode temp1=h;

        while (n>0){
            temp2=temp2.next;
            n--;
        }
        while (temp2!=null){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        temp1.next=temp1.next.next;

        return h.next;
    }
}
