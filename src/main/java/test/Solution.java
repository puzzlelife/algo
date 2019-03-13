package test;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int length=nums.length;
        List<List<Integer>> lists=new ArrayList<>();
        if(length<3){
            return lists;
        }
        for(int index=0;index<length-2;index++){
            Set<Integer> hitInteger=new HashSet<>();
            for (int i=index+1;i<length-1;i++){
                if (hitInteger.contains(nums[i])){
                    continue;
                }
                for (int j=i+1;j<length;j++){
                    if (hitInteger.contains(nums[j])){
                        continue;
                    }
                    if (nums[index]+nums[i]+nums[j]==0){
                        hitInteger.add(nums[i]);
                        hitInteger.add(nums[j]);
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[index]);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        lists.add(list);
                    }
                }
            }
        }

        return lists;
    }
}
