package com.code.LeetCode.simpleness;

import java.util.HashMap;
import java.util.Map;

/** 两数之和
 * @Description
 * @ClassName Sum2Num
 * @Author Liumh
 * @Date 2019/1/25 16:06
 * @Version v1.0
 */
public class Sum2Num {

    private static final int SUM = 26;

    public static void main(String[] args){
        int[] nums = new int[]{2, 7, 11, 15};
        int[] arr = twoSum1(nums, SUM);
        System.out.println(arr[0]+"-"+arr[1]);
    }

    /**
     * 暴力解法
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum1(int[] nums, int target) {
        int x = 0;
        int xVal = 0;

        int y = 0;
        int yVal = 0;
        boolean flag = false;
        for (int i=0; i<nums.length; i++){
            x = i;
            xVal = nums[x];
            for (int j = 0; j < nums.length; j++){
                if (j != x){
                    y = j;
                    yVal = nums[y];
                    flag = xVal+yVal==target ? true : false;
                    if (flag){
                        return new int[]{x, y};
                    }
                }
            }
        }
        return null;
    }


    /**
     * 两遍哈希表
     *  以空间换时间
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        for (int i=0; i<nums.length; i++){
            int elements = target - nums[i];
            if (map.containsKey(elements) && map.get(elements) != i){
                return new int[]{i, map.get(elements)};
            }
        }
        return null;
    }

    /**
     * 一遍哈希表
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int elements = target - nums[i];
            if (map.containsKey(elements)){
                return new int[]{i, map.get(elements)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
