package leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/15 19:43
 *
 * 罗马数字转整数
 */
public class Question13 {
    public int romanToInt(String s) {
        int[] nums=new int[]{1000,500,100,50,10,5,1};
        List<Character> roman= Arrays.asList('M','D','C','L','X','V','I');
        int sum=0;
        int length=s.length();
        for (int i=0;i<length;i++){
            char c=s.charAt(i);
            int index=roman.indexOf(c);
            sum+=nums[index];

            if (i+1!=length && roman.indexOf(s.charAt(i+1))<index ){
                sum-= 2*nums[index];
            }
        }

        return sum;
    }
}
