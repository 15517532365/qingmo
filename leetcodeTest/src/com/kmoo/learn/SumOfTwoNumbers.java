package com.kmoo.learn;

import java.util.ArrayList;
import java.util.List;


public class SumOfTwoNumbers {
/*
1. 两数之和
    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。

    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

    你可以按任意顺序返回答案。



    示例 1：

    输入：nums = [2,7,11,15], target = 9
    输出：[0,1]
    解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
    示例 2：

    输入：nums = [3,2,4], target = 6
    输出：[1,2]
    示例 3：

    输入：nums = [3,3], target = 6
    输出：[0,1]*/
    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        List<String> numStr=new ArrayList<String>();
        for(int i=0;i<nums.length;i++){
            int result=target-nums[i];
            numStr.add(nums[i]+"");
            int idx=numStr.indexOf(result+"");
            if(i!=idx && idx>-1){
                indexs[0]=idx;
                indexs[1]=i;
                return indexs;
            }

        }
        return indexs;
    }

    public static void main(String[] args) {
        int target=6;
        int [] nums={3,2,4};
        int[] result=twoSum(nums,target);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }
}
