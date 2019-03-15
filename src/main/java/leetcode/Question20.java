package leetcode;

import java.util.Stack;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/15 11:35
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class Question20 {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==')'&&!stack.empty()&&stack.peek()=='('){
                stack.pop();
                continue;
            }else if (s.charAt(i)=='}'&&!stack.empty()&&stack.peek()=='{'){
                stack.pop();
                continue;
            }else if (s.charAt(i)==']'&&!stack.empty()&&stack.peek()=='['){
                stack.pop();
                continue;
            }

            stack.push(s.charAt(i));
        }


        return stack.empty();
    }
}
