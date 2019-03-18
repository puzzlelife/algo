package leetcode;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/18 10:20
 *
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Question21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultList=new ListNode(0);
        ListNode temp=resultList;
        while (l1!=null&&l2!=null){
            int a=l1.val;
            int b=l2.val;
            if (a<b){
                temp.next=l1;
                l1=l1.next;
            }else {
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }

        if (l1==null){
            temp.next=l2;
        }else {
            temp.next=l1;
        }


        return resultList.next;
    }


    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
