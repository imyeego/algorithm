package com.imyeego.offer;

import java.util.Arrays;

/**
 * @authur : liuzhao
 * @date : 12/9/20:3:14 PM
 * @des : 替换字符串中的空格为%20
 */
public class Offer04 {

    public static void main(String[] args) {
        String s = "a  b c       d   e f";
        System.out.println(replaceBlank(s));

    }

    private static String replaceBlank(String string) {
        char[] chars = string.toCharArray();
        int len = chars.length;
        int count = 0;
        for (char c : chars) {
            if (c == ' ') count ++;
        }
        int newLen = len + 2 * count;
        chars = Arrays.copyOf(chars, newLen);
        for (int i = len - 1, j = newLen - 1;
                i >= 0 && j >= 0;) {
            if (chars[i] == ' ') {
                chars[j--] = '0';
                chars[j--] = '2';
                chars[j--] = '%';
                i --;
            } else {
                chars[j--] = chars[i--];
            }
        }

        return new String(chars);
    }
}
