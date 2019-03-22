package leetcode;


import java.util.List;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/14 23:46
 */
public class test {
    public static void main(String[] args) {
        Question17 test=new Question17();

        List<String> result=test.letterCombinations("23");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
