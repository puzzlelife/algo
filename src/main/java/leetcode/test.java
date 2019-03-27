package leetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/14 23:46
 */
public class test {
    public static void main(String[] args) {
        Question25 test=new Question25();
        Question25.ListNode h1=new Question25.ListNode(1);
        Question25.ListNode h2=new Question25.ListNode(2);
//        Question25.ListNode h3=new Question25.ListNode(3);
//        Question25.ListNode h4=new Question25.ListNode(4);
//        Question25.ListNode h5=new Question25.ListNode(5);

        h1.next=h2;
//        h2.next=h3;
//        h3.next=h4;
//        h4.next=h5;


        Question25.ListNode result=test.reverseKGroup(h1,2);
        while (result!=null){
            System.out.print(result.val+" ");
            result=result.next;
        }
    }
}
