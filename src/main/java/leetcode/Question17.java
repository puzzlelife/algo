package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/22 11:08
 *
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 * 示例:
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
 */
public class Question17 {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if (digits.length()==0) return result;
        Map<Character,String> numToChar=new HashMap<>();

        numToChar.put('2', "abc");
        numToChar.put('3', "def");
        numToChar.put('4', "ghi");
        numToChar.put('5', "jkl");
        numToChar.put('6', "mno");
        numToChar.put('7', "pqrs");
        numToChar.put('8', "tuv");
        numToChar.put('9', "wxyz");

        String[] strings=new String[digits.length()];
        for (int i=0;i<digits.length();i++){
            char c=digits.charAt(i);
            strings[i]=numToChar.get(c);
        }
        String temp="";
        doBuildList(strings,0,temp,result);


        return result;
    }

    private void doBuildList(String[] strings, int n, String temp, List<String> result) {
        if (n==strings.length){
            result.add(temp);
            return;
        }
        String nString=strings[n];
        for (int i=0;i<nString.length();i++){
            doBuildList(strings,n+1,temp+nString.charAt(i),result);
        }
    }
}
