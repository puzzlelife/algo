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

        String value=String.valueOf(x);

        StringBuilder reverseString=new StringBuilder();

        if (x<0){
            reverseString.append("-");
            max=String.valueOf(Integer.MIN_VALUE);
            value=value.substring(1);
        }

        for (int i=value.length()-1;i>=0;i--){
            reverseString.append(value.charAt(i));
        }

        if (compare(reverseString.toString(),max)>0){
            return 0;
        }

        return Integer.valueOf(reverseString.toString());
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
