package leetcode;


import java.util.List;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/14 23:46
 */
public class test {
    public static void main(String[] args) {
        Question24 test=new Question24();
        Question24.ListNode head=new Question24.ListNode(1);
        head.next=new Question24.ListNode(2);
        head.next.next=new Question24.ListNode(3);
        head.next.next.next=new Question24.ListNode(4);



        Question24.ListNode result =test.swapPairs(head);
        while (result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
}
