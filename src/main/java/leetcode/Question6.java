package leetcode;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/13 12:21
 *
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 *
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 *
 * 请你实现这个将字符串进行指定行数变换的函数：
 *
 * string convert(string s, int numRows);
 * 示例 1:
 *
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 示例 2:
 *
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 *
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 */
public class Question6 {
    public String convert(String s, int numRows) {
        if (numRows==1){
            return s;
        }
        int row=0,line=0;
        int sign=numRows-1;
        boolean reduce=false;
        char[][] array=new char[numRows][s.length()];
        for(int i=0;i<s.length();i++){
            for (int j=0;j<numRows;j++){
                array[j][i]=' ';
            }
        }

        for(int index=0;index<s.length();index++){
            array[line][row]=s.charAt(index);
            if(reduce){
                row++;
                line--;
                if(line==0){
                    reduce =false;
                }
            }else{
                line++;
            }
            if(line==sign){
                reduce=true;
            }
        }

        StringBuffer sb=new StringBuffer();
        for(int i=0;i<numRows;i++){
            for (int j=0;j<s.length();j++){
                if (array[i][j]!=' '){
                    sb.append(array[i][j]);
                }

            }
        }


        return String.valueOf(sb.toString());

    }
}
