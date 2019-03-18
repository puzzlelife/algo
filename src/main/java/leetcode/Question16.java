package leetcode;

import java.util.Arrays;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/17 20:11
 */
public class Question16 {
    public int threeSumClosest(int[] nums, int target) {
        int nearNum=Integer.MAX_VALUE;
        int length=nums.length;
        int near=Integer.MAX_VALUE;


        Arrays.sort(nums);

        for (int i=0;i<length;i++){
            for (int j=i+1;j<length;j++){
                for (int k=j+1;k<length;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    int d=Math.abs(target-sum);
                    if (d<near){
                        nearNum=sum;
                        near=d;
                        if (near==0){
                            return sum;
                        }
                    }
                }
            }
        }

        return nearNum;
    }
}
