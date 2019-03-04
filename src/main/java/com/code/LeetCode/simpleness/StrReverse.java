package com.code.LeetCode.simpleness;

/**
 * @Description 整数翻转
 * @ClassName StrReverse
 * @Author Liumh
 * @Date 2019/1/26 9:58
 * @Version v1.0
 */
public class StrReverse {

    public static void main(String[] args){
        System.out.println(reverse(123213));
    }

    private static int reverse(int x) {
        StringBuffer sb = new StringBuffer(Integer.toString(x));
        sb = sb.reverse();
        Integer res = Integer.valueOf(sb.toString());
        int i = 2 << 31;
        System.out.println(i);
        System.out.println(-2>>31);
        return (res > (2>>31) || res < (-2<<31)) ? 0 : res;
    }
}
