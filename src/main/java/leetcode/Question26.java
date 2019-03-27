package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/27 16:13
 */
public class Question26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
