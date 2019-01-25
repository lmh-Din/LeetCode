package com.code.LeetCode.simpleness;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Description 唯一摩尔斯密码词
 * @ClassName UniqueMose
 * @Author Liumh
 * @Date 2019/1/24 14:29
 * @Version v1.0
 */
public class UniqueMose {

    private static String[] map = {
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
    };

    private static Map<String, Object> initMap = new HashMap<>();

    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        args = new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(args));
        System.out.println(System.currentTimeMillis()-begin);
    }





    public static int uniqueMorseRepresentations(String[] words) {
        if (words == null) return 0;
        HashSet<String> set = new HashSet<String>();
        for (String s : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                sb.append(map[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
