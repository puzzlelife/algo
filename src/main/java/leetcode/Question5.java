package leetcode;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/13 12:20
 *
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 */
public class Question5 {
    public String longestPalindrome(String s) {
        int max=0;
        String maxString="";
        for (int index=0;index<s.length();index++){
            String huiString=huiString(s,index);
            if(huiString.length()>max){

                maxString=huiString;
                max=huiString.length();
            }
        }
        return maxString;
    }
    private String huiString(String s,int index){
        String temp="";
        int left=index,right=index;
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            if(right-left+1>temp.length()){
                temp=s.substring(left,right+1);
            }
            left--;
            right++;

        }

        left=index;right=index+1;
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            if(right-left+1>temp.length()){
                temp=s.substring(left,right+1);
            }
            left--;
            right++;
        }

        return temp;
    }
}
