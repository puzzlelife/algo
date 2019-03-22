package leetcode;


import java.util.List;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/14 23:46
 */
public class test {
    public static void main(String[] args) {
        Question22 test=new Question22();

        List<String> result=test.generateParenthesis(2);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
