package leetcode;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/13 12:23
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 */
public class Question13 {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        int max=strs[0].length();
        String maxStr=strs[0];
        for (String str:strs){
            if(max==0||str.length()==0) return "";
            int index=0;
            while(index<maxStr.length()&&index<str.length()){
                if(str.charAt(index)!=maxStr.charAt(index)){
                    maxStr=maxStr.substring(0,index);
                    max=index;
                    break;
                }
                index++;
                if(index==str.length()){
                    maxStr=maxStr.substring(0,index);
                    max=index;
                }
            }
        }

        return maxStr;
    }
}
