package leetcode;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/24 15:48
 *
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 *
 * 示例:
 *
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 */
public class Question23 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result=null;
        for (ListNode node : lists) {
            result=mergeTwoLists(result,node);
        }

        return result;
    }

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
}
