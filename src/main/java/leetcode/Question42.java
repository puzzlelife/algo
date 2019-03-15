package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/14 23:00
 *
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 *
 * 示例:
 *
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 */
public class Question42 {

    public int trap(int[] height) {

        int maxIndex=0,max=0;
        int length=height.length;
        for (int i=0;i<length;i++){
            if (height[i]>max){
                max=height[i];
                maxIndex=i;
            }
        }
        int[] fromLeft=new int[maxIndex+1];
        int[] fromRight=new int[length-maxIndex+1];

        for (int i=0;i<=maxIndex;i++){
            fromLeft[i]=height[i];
        }
        for (int i=length-1,j=0;i>=maxIndex;i--,j++){
            fromRight[j]=height[i];
        }


        int leftPart=cacl(fromLeft);
        int rightPart=cacl(fromRight);

        int sum=leftPart+rightPart;

        return sum;
    }

    private int cacl(int[] height){
        int sum=0;
        int length=height.length;
        int left=0;
        while (left<length){
            if (height[left]==0) {
                left++;
                continue;
            }
            int right;
            for (right=left+1;right<length;right++){
                if (height[left]>height[right]){
                    continue;
                }


                int area=(right-left-1)*height[left];
                for (int i=left+1;i<right;i++){
                    area=area-height[i];
                }

                sum=sum+area;
                break;
            }

            if (right==length){
                left++;
            }
            left=right;
        }

        return sum;
    }
}
