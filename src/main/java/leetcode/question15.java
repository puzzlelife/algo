package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/13 19:31
 *
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
public class question15 {
    public List<List<Integer>> threeSum(int[] nums) {

        int length=nums.length;
        int chooseNum=3;

        /**
         * 1.用bit选出n个数
         */
        for(int i=1;i<length;i++){
            for (int j=1,bit=1;j<length;bit=1<<bit){

            }
        }

        /**
         * 2.选出这n个数
         */
        List<List<Integer>> lists=new ArrayList<>();


        return lists;
    }
}
