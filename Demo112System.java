package code015;

import java.util.Arrays;

public class Demo112System {

    public static void main(String[] args) {
        currentTimeMillis();
        System.out.println("==========");
        arrayCopy();
    }

    public static void currentTimeMillis() {
        long s = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();

        System.out.println("一共执行了：" + (e - s) + "毫秒");
    }

    public static void arrayCopy() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        System.out.println("替换前：" + Arrays.toString(array2));
        System.arraycopy(array1, 0, array2, 0, 3);
        System.out.println("替换后：" + Arrays.toString(array2));
    }
}
