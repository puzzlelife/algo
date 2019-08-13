package leetcode;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/3/14 23:46
 */
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int group=sc.nextInt();
        while (group>0){
            int nums=sc.nextInt();
            int[] array=new int[nums];
            for (int i=0;i<nums;i++){
                array[i]=sc.nextInt();
            }
            boolean flag=permutation(array,0,false);
            if (flag){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
            group--;
        }
    }

    public static boolean permutation(int[]ss,int i,boolean flag){
        if (flag){
            return flag;
        }
        //1
        if(ss==null||i<0 ||i>ss.length){
            return flag;
        }
        //2
        if(i==ss.length-1){
            if (test(ss)) flag=true;
        }else{
            //3
            for(int j=i;j<ss.length;j++){
                //交换前缀,使之产生下一个前缀
                int temp=ss[j];
                ss[j]=ss[i];
                ss[i]=temp;
                //4
                flag=permutation(ss,i+1,flag);
                //将前缀换回来,继续做上一个的前缀排列.//5
                temp=ss[j];
                ss[j]=ss[i];
                ss[i]=temp;
            }
        }
        return flag;
    }

    public static boolean test(int[] array) {

        for (int index=0;index<array.length;index++){
            if (index==0||index==array.length-1){
                continue;
            }
            if (array[index-1]+array[index+1]<array[index]){
                return false;
            }
        }
        if (array[array.length-2]+array[0]<array[array.length-1]){
            return false;
        }
        if (array[array.length-1]+array[1]<array[0]){
            return false;
        }
        return true;
    }
}

