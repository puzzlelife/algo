package leetcode;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/13 12:20
 *
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 示例 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 * 示例 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * 则中位数是 (2 + 3)/2 = 2.5
 *
 */
public class Question4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length,l2=nums2.length;
        int nums[]=new int[l1+l2];
        int i=0,j=0,t=0;
        while(i<l1||j<l2){
            if(i==l1){
                nums[t]=nums2[j];
                j++;
                t++;
                continue;
            }
            if(j==l2){
                nums[t]=nums1[i];
                i++;
                t++;
                continue;
            }
            if(nums1[i]>nums2[j]){
                nums[t]=nums2[j];
                j++;
            }else{
                nums[t]=nums1[i];
                i++;
            }
            t++;

        }
        int length=l1+l2;
        if(length%2==0){
            return  ((double)nums[length/2]+(double)nums[length/2-1])/2;
        }
        return nums[length/2];
    }
}
