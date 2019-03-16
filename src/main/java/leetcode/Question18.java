package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/16 12:00
 */
public class Question18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists=new ArrayList<>();
        boolean flag=false;
        int length=nums.length;

        if (length<4) return lists;

        for (int i=0;i<length-1;i++){
            if (nums[i]!=nums[i+1]){
                flag=true;
                break;
            }
        }
        if (!flag){
            if (nums[0]*4==target){
                lists.add(Arrays.asList(nums[0],nums[0],nums[0],nums[0]));
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
                for (int k=j+1;k<length;k++){
                    if (k>j+1&&nums[k]==nums[k-1]){
                        continue;
                    }
                    int searchNum=target-(nums[i]+nums[j]+nums[k]);
                    int index =search(searchNum,nums);
                    if (index>k){
                        lists.add(Arrays.asList(nums[i],nums[j],nums[k],nums[index]));
                    }
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
