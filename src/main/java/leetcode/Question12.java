package leetcode;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/15 17:30
 *
 * 整数转罗马数字
 */
public class Question12 {
    public String intToRoman(int num) {
        int[] nums=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String result="";
        for (int i=0;i<nums.length;i++){
            int temp=nums[i];
            while (num>=temp){
                result+=roman[i];
                num=num-temp;
            }

        }
        return result;
    }
}
