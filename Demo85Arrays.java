package code009;

import java.util.Arrays;

public class Demo85Arrays {
    public static void main(String[] args) {
        //将int[]数组按照默认格式变成字符串
        int[] array1 = {1, 2, 3};
        String str = Arrays.toString(array1);
        System.out.println(str);
        //默认升序
        int[] array2 = {3, 5, 8, 2, 6, 4, 7, 1, 9};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        String[] array3 = {"A", "C", "D", "B"};
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));
    }
}
