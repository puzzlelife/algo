package leetcode;

import java.util.Stack;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/15 11:35
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
