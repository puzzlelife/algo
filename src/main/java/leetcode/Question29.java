package leetcode;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/30 12:02
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 *
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 *
 * 示例 1:
 *
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * 示例 2:
 *
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 */
public class Question29 {
    public int divide(int dividend, int divisor) {
        if (dividend==-2147483648&&divisor==-1){
            return 2147483647;
        }
        int result=-1;
        boolean isMinus1= dividend < 0;
        boolean isMinus2= divisor < 0;

        if (isMinus1==isMinus2){
            result = caclu(Math.abs(dividend), Math.abs(divisor));
        }else {
            result = -caclu(Math.abs(dividend), Math.abs(divisor));
        }



        return result;
    }

    private int caclu(int dividend,int divisor){

        int result=0 ;
        while (dividend>=0){
            dividend-=divisor;
            result++;
        }
        return result-1;
    }
}
