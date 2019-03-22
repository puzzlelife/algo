package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/22 13:30
 *
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 *
 * 例如，给出 n = 3，生成结果为：
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 */
public class Question22 {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        String temp="";
        doBuildList(result,n,0,temp,0);

        return result;
    }

    private void doBuildList(List<String> result, int n, int deep, String temp, int rightBrackets) {
        if (deep==n){

            while (rightBrackets>0){
                temp+=")";
                rightBrackets--;
            }
            result.add(temp);

            return;
        }
        doBuildList(result,n,deep+1,temp+"(",rightBrackets+1);
        if (rightBrackets>0){
            doBuildList(result,n,deep,temp+")",rightBrackets-1);
        }

    }


}
