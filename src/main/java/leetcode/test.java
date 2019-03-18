package leetcode;


/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/14 23:46
 */
public class test {
    public static void main(String[] args) {
        Question21 test=new Question21();

        Question21.ListNode l1=new Question21.ListNode(1);
        Question21.ListNode a2=new Question21.ListNode(2);
        Question21.ListNode a3=new Question21.ListNode(3);
        Question21.ListNode l2=new Question21.ListNode(1);
        Question21.ListNode b2=new Question21.ListNode(2);
        Question21.ListNode b3=new Question21.ListNode(4);
        l1.next=a2;a2.next=a3;
        l2.next=b2;b2.next=b3;

        Question21.ListNode result=test.mergeTwoLists(l1,l2);
        while (result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
}
