package leetcode;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/25 17:58
 *
 * 给出一个链表，每 k 个节点一组进行翻转，并返回翻转后的链表。
 *
 * k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么将最后剩余节点保持原有顺序。
 *
 * 示例 :
 *
 * 给定这个链表：1->2->3->4->5
 *
 * 当 k = 2 时，应当返回: 2->1->4->3->5
 *
 * 当 k = 3 时，应当返回: 3->2->1->4->5
 *
 * 说明 :
 *
 * 你的算法只能使用常数的额外空间。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class Question25 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k==1) return head;
        ListNode result=new ListNode(0);
        result.next=head;
        ListNode start=result;

        while (start.next!=null){
            ListNode temp=start;
            int num=0;
            //找到要反转的链表
            while (temp.next!=null && num<k){
                temp=temp.next;
                num++;
            }
            if (num!=k){
                break;
            }
            ListNode end=temp.next,left= start.next,right=left.next,jump=right.next;
            left.next=end;
            ListNode newStart=left;
            //挨个反转
            while (jump!=end){
                right.next=left;
                left=right;
                right=jump;
                jump=jump.next;
            }
            right.next=left;
            //首尾节点关联
            start.next=right;
            start=newStart;
        }


        return result.next;
    }


}
