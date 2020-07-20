package code009;

import java.util.Arrays;
import java.util.Random;

/*
题目：
请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 */
public class Demo86ArraysPractise {
    public static void main(String[] args) {
        String str = "ds5a61354d8s6a1d5w1d5sa";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.println(ch[i]);
        }
    }
}
