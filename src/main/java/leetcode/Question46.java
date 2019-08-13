package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/7/14 16:37
 *
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。
 *
 * 示例:
 *
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 *
 */
public class Question46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int length=nums.length;

        for (int i=0;i<length;i++){
            calu(nums,result,0,length,new ArrayList<>());
        }

        return result;
    }

    private List<List<Integer>> calu(int[] nums, List<List<Integer>> result, int deep,int length,List<Integer> temp) {

        if (deep==length){
            result.add(temp);
            return result;
        }
        temp.add(nums[deep]);
        return calu(nums,result,deep+1,length,temp);
    }


}
