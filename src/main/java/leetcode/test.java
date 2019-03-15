package leetcode;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/14 23:46
 */
public class test {
    public static void main(String[] args) {
        Question42 test=new Question42();

        int[] nums=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        int sum=test.trap(nums);
        System.out.println(sum);
    }
}
