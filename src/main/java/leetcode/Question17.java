package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/22 11:08
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
