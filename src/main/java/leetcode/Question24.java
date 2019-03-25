package leetcode;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/24 15:56
 */
public class Question24 {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode swapPairs(ListNode head) {

        ListNode result=new ListNode(0);

        if (head==null) return null;
        result.next=head;

        ListNode start=result;
        while (start!=null&&start.next!=null&&start.next.next!=null){
            ListNode temp=start.next;

            ListNode jump=start.next.next.next;
            start.next.next.next=start.next;
            start.next=start.next.next;
            start.next.next.next=jump;
            start=temp;
        }

        return result.next;
    }
}
