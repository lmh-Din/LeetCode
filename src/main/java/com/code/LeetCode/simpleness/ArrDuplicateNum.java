package com.code.LeetCode.simpleness;

import java.util.Arrays;

/**
 * @Description 数组中重复数字
 * @ClassName ArrDuplicateNum
 * @Author Liumh
 * @Date 2019/2/11 13:18
 * @Version v1.0
 */
public class ArrDuplicateNum {

    public static void main(String[] args){
        int[] nums = new int[]{2, 3, 1, 0, 2, 5};
        int[] duplication = new int[nums.length];
        duplicate(nums, nums.length, duplication);
        System.out.println(Arrays.toString(duplication));
    }

    public static boolean duplicate(int[] nums, int length, int[] duplication) {
        if (nums == null || length <= 0)
            return false;
        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
