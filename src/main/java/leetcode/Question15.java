package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
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
public class Question15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int sum=0;
        List<List<Integer>> lists=new ArrayList<>();
        boolean flag=false;
        int length=nums.length;

        if (length<3) return lists;

        for (int i=0;i<length-1;i++){
            if (nums[i]!=nums[i+1]){
                flag=true;
                break;
            }
        }
        if (!flag){
            if (nums[0]*3==sum){
                lists.add(Arrays.asList(nums[0],nums[0],nums[0]));
            }
            return lists;
        }



        Arrays.sort(nums);
        for (int i=0;i<length;i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for (int j=i+1;j<length;j++){
                if (j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                int index =search(sum-(nums[i]+nums[j]),nums);
                if (index>j){
                    lists.add(Arrays.asList(nums[i],nums[j],nums[index]));
                }
            }
        }

        return lists;
    }

    private int search(int num,int[] nums){
        int begin=0,end=nums.length-1;
        while (begin<=end){
            int middle=(begin+end)/2;
            if (nums[middle]>num) {end=middle-1;}
            else if (nums[middle]<num) {begin=middle+1;}
            else {
                while (middle<nums.length-1&&nums[middle]==nums[middle+1]){
                    middle++;
                }
                return middle;
            }
        }
        return -1;
    }
}
