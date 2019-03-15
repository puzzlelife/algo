package leetcode;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/13 12:21
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 */
public class Question7 {
    public int reverse(int x) {
        String max=String.valueOf(Integer.MAX_VALUE);
        boolean isNegative=false;
        if (x<0){
            isNegative=true;
            x= -x;
        }
        String intValue=String.valueOf(x);
        String reverseValue=new String();
        for (int index=intValue.length()-1;index>=0;index--){
            reverseValue+=intValue.charAt(index);
        }

        if (compare(reverseValue,max)>0){
            return 0;
        }

        if (isNegative){
            reverseValue="-"+reverseValue;
        }

        return Integer.valueOf(reverseValue);
    }
    private int compare(String a,String b) {
        if (a.length()>b.length()){
            return 1;
        }
        if (a.length()<b.length()){
            return -1;
        }
        return a.compareTo(b);
    }
}
